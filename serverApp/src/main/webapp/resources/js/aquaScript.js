function paintAquarium() {
    var aquarium = new Aquarium();
	aquarium.fillWater(0.9);

    var seaCreature = new SeaCreature("sea creature");
    Fish.prototype = seaCreature;
    Star.prototype = seaCreature;

    var fish1 = new Fish("fish1", 200, 200, goldFish);
    var fish2 = new Fish("fish2", 100, 400, blueFish);
    var fish3 = new Fish("fish3", 1000, 300, shark);
    var star1 = new Star("star1", 100, starfish);
    var star2 = new Star("star2", 900, starfish);
    var star3 = new Star("star3", 300, starfish);
}

function SeaCreature(name){
		this.image = null;
		this.name = name;
		this.canSwim = true;

		var creatureContainer = null;

		var delta = getInt(aquaDiv.style.margin)+10;
		var heightDelta = getInt(emptyDiv.style.height) + getInt(aquaDiv.style.margin);


		SeaCreature.prototype.create = function(x, y) {
				x = parseInt(x);
				y = parseInt(y);

                creatureContainer = document.createElement("div");
				creatureContainer.id = "creatureContainerDiv";
				creatureContainer.style.position = 'absolute';
				creatureContainer.style.left = (x+delta)+'px';
				if(this.canSwim){
						creatureContainer.style.top = (y+heightDelta)+'px';
				}else{
						var waterHeight = getInt(waterDiv.style.height);
						creatureContainer.style.top = (waterHeight + heightDelta - 125)+'px';
				}
				creatureContainer.style.width='100px';
				creatureContainer.style.height='30px';
				creatureContainer.style.background='#C2DFFF';
				waterDiv.appendChild(creatureContainer);

				if(this.canSwim){
						var newFish = this.image.cloneNode(true);
						newFish.id = "fish"+(fishCounter++);
						newFish.style.visibility = 'visible';
						creatureContainer.appendChild(newFish);
				}else{
						var newStar = this.image.cloneNode(true);
          	            newStar.id = "star"+(starCounter++);
        		        newStar.style.visibility = 'visible';
          	            creatureContainer.appendChild(newStar);
				}
		}

}

function Fish(name, x, y, image){
	fishCounter = 0;
    this.image = image;
	this.name = name;
    this.create(x,y);
}

function Star(name, x, image){
		starCounter = 0;
    this.image = image;
		this.name = name;
		this.canSwim = false;
		this.create(x, 0)
}

function Aquarium(){
    var aquarium = document.getElementById("aquaDiv");
    aquarium.style.width='1200px';
    aquarium.style.height='800px';
    aquarium.style.margin='50px';
    aquarium.style.paddingLeft='2px';
    aquarium.style.paddingBottom='2px';
    aquarium.style.paddingRight='2px';
    aquarium.style.background='black';

    Aquarium.prototype.fillWater = function(n){
				var empty = document.createElement("div");
				empty.id = "emptyDiv";
				empty.style.width='1200px';
				var height = n*800;
				empty.style.height=(800-height) + 'px';
				empty.style.background='white';
				aquarium.appendChild(empty);

				var water = document.createElement("div");
				water.id = "waterDiv";
				water.style.width='1200px';
				water.style.height=height + 'px';
				water.style.background='#C2DFFF';
				aquarium.appendChild(water);
    }
}

function getInt(value){
		return parseInt(value.substring(0,value.length-2));
}

