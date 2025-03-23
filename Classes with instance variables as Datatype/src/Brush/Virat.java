package Brush;

public class Virat {

    Ticket ticket;

    Virat(Ticket ticket) {
        this.ticket = ticket;
        System.out.println(this.ticket);
    }

    void play(Cricket cricket) {
        System.out.println("Virat class");
        if (cricket != null) {
            cricket.watch(this.ticket);
            cricket.profit(this.ticket);
        } else {
            System.out.println("reference");
        }
    }

    void clean(Brush brush) {
        System.out.println("Virat class");
        if (brush != null) {
            brush.clean();
            brush.scrub();
        } else {
            System.out.println("reference");
        }
    }

    void relax(Ticket ticket) {
        System.out.println("running");
        if (ticket != null) {
            ticket.sell();
            ticket.buy();
        } else {
            System.out.println("reference");
        }
    }

    void style(Clip clip) {
        System.out.println("running style");
        if (clip != null) {
            clip.hold();
        }
    }
}
