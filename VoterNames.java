/*
 * Assignment10
 * Nicolas McDonald
 * ICS111 004
 */

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.PrintWriter;

class Voter implements Comparable<Voter> { 
    private String firstName;
    private String lastName;
    private String gender;
    private String address;
    private String districtNumber;
    
            
        Voter(String fn, String ln, String g, String addr, String district) {
            lastName = ln;
            firstName = fn;
            gender = g;
            address = addr;
            districtNumber = district;
            
        }
        
        public String getFirstName() {
            return this.firstName;
        }
        
        @Override
        public int compareTo(Voter o) {
            int v1 = Integer.parseInt(this.districtNumber);
            int v2 = Integer.parseInt(o.districtNumber);
            if (v1>v2) {
                return  1;
            }
            else if (v1<2) {
                return -1;
            }
            else {
                return -1;
            }
        }

        public int addDistricts() { 
            int districtInt = Integer.parseInt(this.districtNumber);
            while (districtInt == 1) {
                for (int i=0; i<voterList.size();i++) {
                    districtInt++;
                    return districtInt;
                }
            }
            districtInt = 0;
            while (districtInt == 2) {
                for (int i=0; i<voterList.size();i++) {
                    districtInt++;
                    return districtInt;
                }
            }
            districtInt = 0;
            while (districtInt == 3) {
                for (int i=0; i<voterList.size();i++) {
                    districtInt++;
                    return districtInt;
                }
            }
            districtInt = 0;
            while (districtInt == 4) {
                for (int i=0; i<voterList.size();i++) {
                    districtInt++;
                    return districtInt;
                }
            }

        }

        public String toCSV() {
            return (districtNumber +","+lastName+","+firstName+","+gender+","+address);
        }

        public String toString() {
            return(lastName+", "+firstName+" ("+gender+")\n"+"District: "+districtNumber+"\n"+address);
        }

    }

public class VoterNames {

    public static void readFile(String fileName, ArrayList <Voter> voterList) throws FileNotFoundException{
        String line = "";
        String [] data;
        File newFile = new File (fileName);
        Scanner scan = new Scanner(newFile);

        while(scan.hasNextLine()) {
            line = scan.nextLine();
            data =line.split(",");
            if (line.length()>1) {
                voterList.add(new Voter(data[1], data[2], data[3], data[4], data[0]));
            }
        }
        scan.close();
    }


    public static void write(String fileName, ArrayList<Voter> vList) throws FileNotFoundException {
        PrintWriter outputFile = new PrintWriter (fileName);
        for (int i=0; i<vList.size(); i++) {
            outputFile.println(vList.get(i).toCSV());
        }
    }
    

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList <Voter> voterList = new ArrayList<>();

        readFile("HI_Island_Voters.csv", voterList);

 //       Total number of votes using size() method
 //       Total votes in each district ( Integer.parseInt() ) implement a method in the voter class with this 
        System.out.println(voterList.size()+" voters created.");
 //     System.out.println("District 1: "+ );
 //     System.out.println("District 2: "+ );
 //     System.out.println("District 3: "+ );
 //     System.out.println("District 4: "+ );

        Collections.sort(voterList);

        write("HI_Island_Voters_Sorted.csv", voterList);

        for (int i=0; i<voterList.size();i++) {
            System.out.println(voterList.get(i));
            System.out.println();

        }

        }

    }


