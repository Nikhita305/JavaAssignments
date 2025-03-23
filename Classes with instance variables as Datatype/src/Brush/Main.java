package Brush;

public class Main {
    public static void main(String[] args) {
        Clip[] clips = {
                new Clip(Color.RED),
                new Clip(Color.BLUE),
                new Clip(Color.GREEN),
                new Clip(Color.YELLOW)
        };

        Pushpa pushpa = new Pushpa();
        pushpa.useClip(clips);

        Ticket ticket = new Ticket(TicketType.VIP, 500);
        Cricket cricket = new Cricket(ticket);
        Brush brush = new Brush(Color.BLUE);

        Virat virat = new Virat(ticket);

        System.out.println("Playing:");
        virat.play(cricket);

        System.out.println("Cleaning:");
        virat.clean(brush);

        System.out.println("Relaxing:");
        virat.relax(ticket);

        System.out.println("Styling:");
        virat.style(clips[0]);
    }
}
