import java.util.concurrent.TimeUnit;
import java.io.*;
import java.util.*;

class DataPortal
{
    public static Arena[] a = new Arena[4];


    public static void main(String[] args) throws InterruptedException {

        readFile("ARENAS"); // load the data from Arenas File


        int getOp = 0;

        System.out.print("~~ City of Windsor Data Portal Prototype ~~\n");

        Scanner sc = new Scanner(System.in);

        do {

            // menu
            System.out.println("\nMenu");
            System.out.println("(1)\tData");
            System.out.println("(2)\tSearch");
            System.out.println("(3)\tExit");
            System.out.print("Select option: ");
            getOp = sc.nextInt();


            if(getOp == 1) {

                int getData; //Stores Data selection option
                String categoryName = "";

                do {
                    System.out.println("\nData Selection");
                    System.out.println("(1)\tArenas");
                    System.out.println("(2)\tBack");
                    System.out.print("Select Option: ");
                    getData = sc.nextInt();

                    if(getData == 1) {
                        System.out.println("|Arena ID|  |Arena Name|  |Arena Address|  |Arena Latitude|  |Arena Longitude|" +
                                "");
                        for(int i = 0; i < 4; ++i) {
                            a[i].printAll();
                        }
                    }else if(getData == 2) {
                    }else {
                        System.out.println("Input Invalid");
                    }
                }while(getData != 2);

            }else if(getOp == 2) {
                System.out.println("Enter Data Name: ");
                String getSearch = sc.next();

                if(getSearch.equalsIgnoreCase("ARENAS")) {
                    System.out.println("|Arena ID|  |Arena Name|  |Arena Address|  |Arena Latitude|  |Arena Longitude|");
                    for(int i = 0; i < 4; ++i) {
                        a[i].printAll();
                    }
                }else {
                    System.out.println("No Results Found");
                }
            }else if( getOp == 3){
                System.out.println("Exiting Data Portal...");
                TimeUnit.SECONDS.sleep(4);
                System.out.println("Goodbye! :)");
            }else {
                System.out.println("Input Invalid");
            }

        }while(getOp != 3);
    }


    public static void readFile(String Category)
    {
        int n = 0; // counter

        // if Arenas
        if(Category.equals("ARENAS")) {

            String csvFile = "C:\\Users\\ajtor\\IdeaProjects\\Vibez\\src\\ARENAS.csv";
            String line = "";
            String split = ",";
            BufferedReader br = null;


            int id = 0;
            float latitude = 0;
            float longitude = 0;
            String name = "";
            String address = "";


            int skip = 0;
            try {
                br = new BufferedReader(new FileReader(csvFile));
                while((line=br.readLine()) != null) {
                    if(skip == 0) {
                        ++skip;
                        continue;
                    }else {
                        String[] data = line.split(split);
                        id = Integer.parseInt(data[0]);
                        name = data[1];
                        address = data[2];
                        latitude = Float.parseFloat(data[3]);
                        longitude = Float.parseFloat(data[4]);

                        a[n] = new Arena(n,name,address,latitude,longitude);
                        ++n;
                    }
                }
            }catch(IOException e) {
                e.printStackTrace();
            }
        }else {

        }
    }
}
