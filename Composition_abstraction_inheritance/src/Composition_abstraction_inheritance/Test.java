package Composition_abstraction_inheritance;
import java.util.Scanner;
public class Test {
   
       static String allinfos="";
       public static void main(String[] args) {
        
        Motherboard mb = new Motherboard("520-15IKB", "Lenovo China",  32, 4, "DDR4");
        PcCase pcCase = new PcCase("Lenovo laptop case", "Plastic", "378 mm x 260 mm x 22,9 mm");
        Programs programs = new Programs();
        Harddisk hd = new Harddisk("Samsung", "SSD", 250, 500, 450, programs);
        Ram ram = new Ram("Samsung", "DDR4", 12, 2133);
        GraficCard graficCard = new GraficCard("NVIDIA® GeForce® 940MX","External", 2, 300);
        Cpu cpu = new Cpu("Intel® Core™ i7", 4, 2.700, 2904, 4);
        Resolution resolution = new Resolution(1920, 1080);
        Monitor monitor = new Monitor("LG", "LCD", "15.5", resolution);
        Computer computer = new Computer(mb, pcCase, hd, ram, graficCard, cpu, monitor,"Lenovo Ideapad 520", "Windows 10");
        
        String infos="-------------------------------------------------------------------------------------------------------------------------\n"+ 
        "SYSTEM INFORMATIONS"+"\n"+"Computer name : "+ computer.getComputer_name()+ "\n"+ "Operating System : "+computer.getOS()+ "\n"+
        "-----MOTHERBOARD-----\n"+
        "Model : "+mb.getModel()+ "\n"+ "Producer : "+mb.getProducer()+ "\n"+ "Maximum ram capacity : " +mb.getMax_ram_capacity()+"\n" +"Number of available ram slot : "+mb.getMax_ram_slot_capacity() +"\n"+
        "Supported ram type : "+ mb.getSupported_ram_type() +"\n" +
        "------COMPUTER CASE-----\n"+
        "Case model : "+pcCase.getCasemodel() +"\n"+ "Case material : "+pcCase.getCasematerial() +"\n"+ "Case size : "+pcCase.getCasesize() + "\n"+
        "-----HARDDISK-----\n"+
        "Harddisk model name : " + hd.getName()+"\n"+ "Harddisk type : "+ hd.getCardtype() + "\n"+ "Harrdisk capacity : "+hd.getStorage_capacity()+"\n"+ "Reading speed : "+hd.getReading_speed()+"\n"+
        "-----LOADED PROGRAMS-----\n" +hd.getPrograms().getPrograms() +"\n" + "Writing speed : " +hd.getWriting_speed() +"\n"+
        "-----RAM-----\n"+
        "Ram model : "+ram.getName()+"\n"+ "Ram type : "+ ram.getCardtype()+"\n"+ "Ram capacity : "+ram.getStorage_capacity() +"\n"+ "Ram speed : " +ram.getSpeed() + " Mhz"+"\n"+
        "-----GRAFIC CARD-----\n"+
        "Grafic card model: " +graficCard.getName() +"\n"+ "Card type : " + graficCard.getCardtype()+"\n"+"Card storage : "+graficCard.getStorage_capacity()+"\n"+"Card speed : "+graficCard.getSpeed() +" Mhz"+"\n"+
        "-----CPU-----\n"+
        "Cpu model name : " +cpu.getCpu_model()+"\n"+ "Cache capacity : " +cpu.getCache_capacity() +" MB "+"\n"+"Base frequency : "+ cpu.getBase_frequency()+"\n"+"Max frequency : "+cpu.getMax_frequency()+"\n"+
        "Cpu core number : "+cpu.getCore_number()+"\n"+
        "-----MONITOR-----\n"+
        "Monitor model : "+monitor.getModel() +"\n"+"Monitor type : "+monitor.getType() +"\n"+ "Monitor size : "+ monitor.getSize()+"\n"+"Resolution : "+ resolution.getWidth()+ " x "+resolution.getWidth() +"\n"+
        "--------------------------------------------------------------------------------------------------------------------------------------";
       
        String asking ="What would you like to do ?\n"
        +"1 : Show system informations\n"
        +"2 : Change system features\n"
        +"3 : Open browser\n"
        +"4 : Open area calculator\n"
        +"q : Quit \n";
        
        
        
                
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println(asking);
            String choice =scanner.nextLine();
            if(choice.equals("1")){
                System.out.println(infos);
            }
            if(choice.equals("2")){
                System.out.println("Which feature of part of the computer do you want to change?\n"+
                        
                        "1 : Harddisk\n"+
                        "2 : Ram :\n"+
                        "3 : Grafic card\n"
                        );
                String x = scanner.nextLine();
                if(x.equals("1")){
                    String oldcardtype = hd.getCardtype();
                    int oldstoragecapcity= hd.getStorage_capacity();
                    System.out.println("Change harddisk type and capacity of storage");                   
                    System.out.print("Harddisk type : ");  
                    String newharddisktype=scanner.next();
                    hd.setCardtype(newharddisktype);
                    System.out.print("Harddisk storage :");
                    int newharddiskstorage=scanner.nextInt();
                    hd.setStorage_capacity(newharddiskstorage);
                    System.out.println("Old harddisk type : "+oldcardtype+" old harddisk storage : "+ oldstoragecapcity+" new harddisk type : "+hd.getCardtype()+" new harddisk storage : "+ hd.getStorage_capacity()+"\n");
                     scanner.nextLine();
                }
                 if(x.equals("2")){
                
                    String oldcardtype = ram.getCardtype();
                    int oldstoragecapcity= ram.getStorage_capacity();
                    System.out.println("Change ram type and capacity of storage");                   
                    System.out.print("Ram type : ");  
                    String newramtype=scanner.next();
                    ram.setCardtype(newramtype);
                    System.out.print("Ram storage :");
                    int newramstorage=scanner.nextInt();
                    ram.setStorage_capacity(newramstorage);
                    System.out.println("Old ram type : "+oldcardtype+" old ram storage : "+ oldstoragecapcity+" new ram type : "+ram.getCardtype()+" new ram storage : "+ ram.getStorage_capacity()+"\n");
                    scanner.nextLine();           
                }
                  if(x.equals("3")){
                    String oldcardmodel = graficCard.getName();
                    int oldstoragecapcity= graficCard.getStorage_capacity();
                    System.out.println("Change grafic card model and capacity of storage ");                   
                    System.out.print("Grafic card name : ");  
                    String newgraficcardtype=scanner.next();
                    graficCard.setCardtype(newgraficcardtype);
                    System.out.print("Grafic card storage :");
                    int newgraficcardstorage=scanner.nextInt();
                    graficCard.setStorage_capacity(newgraficcardstorage);
                    System.out.println("Old grafic card model : "+oldcardmodel+" old grafic card storage : "+ oldstoragecapcity+" new grafic card model : "
                    +graficCard.getCardtype()+" new grafic card storage : "+ graficCard.getStorage_capacity()+"\n");
                    scanner.nextLine();
                }         
            }
            if(choice.equals("3")){
                computer.getHarddisk().getPrograms().browser();
                System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
                
            }
            if(choice.equals("4")){
                computer.getHarddisk().getPrograms().calculator();
               
            }
            if(choice.equals("q")){
                System.out.println("System shut down...");
                break;
            }   
        }   
        }
}


