package main;

public class WildBuki {
    final String infowhere = "обитающие на Восточном Полюсе";
    final String infowhy = "Дикие Буки используют, выщипанный мех, для строительства гнезд";
    public void bite(){
        System.out.format("Дикие Буки, %s, начинают щипать беззащитные ноги.\n",infowhere);
    }
    public void whytheybite(){
        System.out.println(infowhy);
    }
}
