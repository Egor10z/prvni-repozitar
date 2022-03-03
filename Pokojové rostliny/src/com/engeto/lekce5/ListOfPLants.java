package com.engeto.lekce5;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfPLants {

    private List<Plant>listOfPLants = new ArrayList<Plant>();

    public void addPlant(Plant plant) {
      listOfPLants.add(plant);
    }

    public Plant getPlant(int order) {
        return listOfPLants.get(order);

        }

    public Plant removePlant(int order) {
       return listOfPLants.remove(order);

    }
    public void loadFromFile(String filename){
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader(filename))))
        {
            catch
        }

    }
    }



