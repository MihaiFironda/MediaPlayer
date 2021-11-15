public class proba {
    public static void main(String[] args) {

        Melodie m1= new Melodie(12,"Animals");
        Melodie m2= new Melodie(10, "Forever");
        Gifuri g1 = new Gifuri(23,"Young");

        Melodie m3= new Melodie(9,"Street");
        Videoclip v1 = new Videoclip(45,"Pause");

        Playlist p1 = new Playlist(67,"Document");
        Playlist p2 = new Playlist(30,"Me");
        Playlist p3 = new Playlist(15, "Mylove");


        p1.addElement(m1);
        p1.addElement(m2);
        p1.addElement(g1);

        p2.addElement(m3);
        p2.addElement(v1);
        p2.addElement(p1);
        p2.addElement(p3);

        System.out.println(p2);
        System.out.println(p2.durataMelodii());
        System.out.println(p1.getDurata());
        System.out.println(p2.getDurata());

    }
}
