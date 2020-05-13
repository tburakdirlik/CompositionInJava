

package Composition_abstraction_inheritance;

public class Computer {
    
    private Motherboard motherboard;
    private PcCase pcCase;
    private Harddisk harddisk; 
    private Ram ram;
    private GraficCard graficCard;
    private Cpu cpu;
    private Monitor monitor;
    private String computer_name;
    private String OS;
    
    public Computer(Motherboard motherboard, PcCase pcCase, Harddisk harddisk, Ram ram, GraficCard graficCard, Cpu cpu, Monitor monitor,String computer_name, String OS) {
        this.motherboard = motherboard;
        this.pcCase = pcCase;
        this.harddisk = harddisk;
        this.ram = ram;
        this.graficCard = graficCard;
        this.cpu = cpu;
        this.monitor = monitor;
        this.computer_name=computer_name;
        this.OS=OS;
    }
    
    public Motherboard getMotherboard()                     {               return motherboard;                 }
    public void setMotherboard(Motherboard motherboard)     {               this.motherboard = motherboard;     }
    public PcCase getPcCase()                               {               return pcCase;                      }
    public void setPcCase(PcCase pcCase)                    {               this.pcCase = pcCase;               }
    public Harddisk getHarddisk()                           {               return harddisk;                    }
    public void setHarddisk(Harddisk harddisk)              {               this.harddisk = harddisk;           }
    public Ram getRam()                                     {               return ram;                         }
    public void setRam(Ram ram)                             {               this.ram = ram;                     }
    public GraficCard getGraficCard()                       {               return graficCard;                  }
    public void setGraficCard(GraficCard graficCard)        {               this.graficCard = graficCard;       }
    public Cpu getCpu()                                     {               return cpu;                         }
    public void setCpu(Cpu cpu)                             {               this.cpu = cpu;                     }
    public Monitor getMonitor()                             {               return monitor;                     }
    public void setMonitor(Monitor monitor)                 {               this.monitor = monitor;             }
    public String getComputer_name()                        {               return computer_name;               }
    public void setComputer_name(String computer_name)      {               this.computer_name = computer_name; }
    public String getOS()                                   {               return OS;                          }
    public void setOS(String OS)                            {               this.OS = OS;                       }
}




