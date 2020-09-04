package learn.designPattern;

import learn.designPattern.factory.ShittyFactory;
import learn.designPattern.iterator.BadassList;
import learn.designPattern.factory.production.ShitName;
import learn.designPattern.singleton.ShittySingleton;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        singletonExample();
        factoryExample();
        iteratorExample();
    }

    public static void singletonExample(){
        System.out.println("This is singleton example:");
        ShittySingleton callAShit = ShittySingleton.instance;
        System.out.println(callAShit.showShitColor());
    }

    public static void factoryExample(){
        System.out.println("This is factory example:");
        ShitName callJackal = ShittyFactory.createJackal();
        ShitName callDuck = ShittyFactory.createDuckyMomo();
        System.out.println("When I called Jackal, he said : " + callJackal.getName());
        System.out.println("When I called Duc, he said : " + callDuck.getName());
    }

    public static void iteratorExample(){
        List<String> trollingList = new ArrayList<>();
        trollingList.add("<3 Dev Club");
        trollingList.add("<3 game Programming");
        trollingList.add("AI Seminar");
        trollingList.add("IoT Seminar");

        BadassList goodList = new BadassList();
        goodList.badassList = trollingList;

        while(goodList.hasNext()){
            System.out.println(goodList.next());
        }
    }
}
