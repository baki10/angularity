package js.angular.web.controller;

import js.angular.common.MailMail;
import js.angular.server.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

  @Autowired
  private HelloWorldService helloWorldService;

  @Autowired
  private MailMail mailMail;

  @RequestMapping({"/", "/hello*"})
  public ModelAndView helloWorld(@RequestParam(value = "name", defaultValue = "world") String name) {
    return new ModelAndView("hello", "message", helloWorldService.getMessage(name));
  }

  @RequestMapping({"/aquarium"})
  public ModelAndView aquarium() {
    return new ModelAndView("aquarium");
  }

  @RequestMapping(value = "/oop", method = RequestMethod.GET)
  public String showLesson3() {
    return "oop";
  }

  @RequestMapping(value = "/lesson4", method = RequestMethod.GET)
  public String showLesson4() {
    return "lesson4";
  }

  @RequestMapping(value = "/lesson5", method = RequestMethod.GET)
  public String showLesson5() {
    return "lesson5";
  }

  @RequestMapping(value = "/lesson5", method = RequestMethod.POST)
  @ResponseBody
  public String responseLesson5() {
    return "Text from server";
  }

  @RequestMapping(value = "/list", method = RequestMethod.GET)
  public String list() {
    return "list";
  }

  @RequestMapping(value = "/detail", method = RequestMethod.GET)
  public String detail() {
    return "detail";
  }

  @RequestMapping(value = "/errorPage", method = RequestMethod.GET)
  public String error() {
    throw new NullPointerException("NPE");
  }

  @RequestMapping(value = "/email", method = RequestMethod.GET)
  public String sendEmail(@RequestParam(value = "from") String from,
                          @RequestParam(value = "pswd") String pswd,
                          @RequestParam(value = "to") String to) {
    JavaMailSenderImpl mailSender = (JavaMailSenderImpl) mailMail.getMailSender();
    mailSender.setUsername(from);
    mailSender.setPassword(pswd);
    mailMail.sendMail(from,
        to,
        "Testing123",
        "Testing only \n\n Hello Spring Email Sender");
    return "hello";
  }
}