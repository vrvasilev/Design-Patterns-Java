/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

/**
 *
 * @author user
 */
public class FactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Competition comFactory = CompetitionFactory("FootballCompetition");
        comFactory.getCompetition();
    }
    
    public static Competition CompetitionFactory(String typeofCompetition){
        switch(typeofCompetition){
            case "FootballCompetition" : return new FootballCompetition();
            case "Formula1Competition" : return new Formula1Competition();
            case "HorseCompetition" : return new HorseCompetition();
        }
        return null;
    }
    
}
