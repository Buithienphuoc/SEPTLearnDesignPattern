package learn.designPattern.factory;

import learn.designPattern.factory.production.DuckyMomo;
import learn.designPattern.factory.production.Jackal;
import learn.designPattern.factory.production.ShitName;

public class ShittyFactory {
   public static ShitName createDuckyMomo(){
       return new DuckyMomo();
   }

   public static ShitName createJackal(){
       return new Jackal();
   }
}
