package com.codeRefactoring.haircut;

public interface HairCut {

    public String getDescription();

    public double getCost();

}


class CalculateHairCut implements HairCut{

    enum HairCutOptions { BASIC_CUT, PERM, HAIR_FROSTING };

    HairCutOptions optionPicked;

    CalculateHairCut(HairCutOptions options){

        optionPicked = options;

    }

    public String getDescription() {

        if(optionPicked == HairCutOptions.PERM){

            return "\nAdd Chemicals and Put Hair in Rollers";

        } else
        if(optionPicked == HairCutOptions.HAIR_FROSTING){

            return "\nAdd Chemicals and Put Hair in Foil";

        } else return "Trim the Hair";

    }

    public double getCost() {
        // TODO Auto-generated method stub
        return 0;
    }

}


abstract class HairCutDecorator implements HairCut{

    protected HairCut hairCut;

    HairCutDecorator(HairCut hairCut){

        this.hairCut = hairCut;

    }

    public String getDescription(){

        return hairCut.getDescription();

    }

    public double getCost(){

        return hairCut.getCost();

    }

}


class RegularHairCut implements HairCut{

    public String getDescription() {

        return "Trim the Hair";

    }


    public double getCost() {

        return 10.00;

    }

}


class Perm extends HairCutDecorator{

    Perm(HairCut hairCut) {
        super(hairCut);
    }

    public String getDescription() {

        return hairCut.getDescription() + "\nAdd Chemicals and Put Hair in Rollers";

    }


    public double getCost() {

        return hairCut.getCost() + 75.00;

    }


}

class TestHairCut{

    public static void main(String[] args){

        HairCut permAndCut = new Perm(new RegularHairCut());

        System.out.println("Services");

        System.out.println(permAndCut.getDescription());
        System.out.println("Price: $" + permAndCut.getCost());

    }

}