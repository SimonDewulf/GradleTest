package com.vdabmao2018.lessen.les5.beehive;

public class Worker extends Bee {
    //elke Worker heeft een capacity en een load
    //deze variabelen zijn inherent verbonden aan de worker class

private int capacity;
private int load;


    //constructors don't have a returntype. plus Capital, because it's the name of the CLass
    //kijk welke variabele naar wat verwijst!


    public Worker(String name, int capacity, int load) {
        super(name);                                                            //NAME IS DEEL VAN DE BEE SUPERCLASS => om naar name in de Worker constructor te verwijzen
                                                                                //de super() call moet altijd EERST
        this.capacity = capacity;
        this.load = load;
    }

    //NIET STATIC.
    //static betekent dat het een globale functie is. enkel workers doen gatherNectar() => niet nodig daarbuiten
    //non static functies hebben een context nodig. zonder worker-bij kun je geen gatherNectar uitvoeren
    // ==> static methods zijn dus eigenlijk niet object georiënteerd.
    public void gatherNectar(){
        for(int i = 0; i < 10; i++){
            //visit flower
            load +=5;
        }




    }
    @Override                                                    //OVERRIDE = THE MOST SPECIFIC METHOD => IN THE LOWEST SUBCLASS WILL ALWAYS BE USED.
    public void fly(){
        System.out.println("worker " + this.getName() + " enthousiasticly to the next flower");

    }
}
