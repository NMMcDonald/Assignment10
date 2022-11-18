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
import java.io.FileReader;

class Voter {
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
    
        public static void readFile(String newFile, ArrayList <Voter> voterList) {
            String line = "";
            String [] data;
            ArrayList <Voter> voterList = new ArrayList<>();
            File newFile = new File ("HI_Island_Voters.csv");
            Scanner scan = new Scanner(newFile);
    
            while(scan.hasNextLine()) {
                line = scan.nextLine();
                data =line.split(",");
                if (line.length()>1) {
                    voterList.add(new Voter(data[1], data[2], data[3], data[4], data[0]));
                }
            }
            
        }
        
        /*
         * The number of voters in a string data type.
         * @return the number of voters.
         */
        public static int getnVoters() {
            return nVoters;
        }
    
        /* Returns the whole ID of each voter.
         * @return voters ID and the name they input.
         */
        public String toString() { 
            String fVoter = "\n" + voterID + " " + name;
            return fVoter;
        }
    }

public class VoterNames {

    public static void main(String[] args) throws FileNotFoundException {
        
        }

    }


