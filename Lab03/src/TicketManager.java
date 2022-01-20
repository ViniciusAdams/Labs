public class TicketManager {

    private Ticket[] tickets;
    private int sold = 0;
    private int maxTickets = 500;

    //method to create an array with size maxTickets of 500
    TicketManager() {
        tickets = new Ticket[maxTickets];
    }

    //method to add a ticket to the draw just and if the number dont exceed maxTickets
    public boolean buy(Ticket t) {
        boolean ticketAdded = false;
        for (int i = 0; i < maxTickets; i++) {
            if (tickets[i] == null) {
                tickets[i] = t;
                ticketAdded = true;
                sold++;
                break;
            }
        }
        return ticketAdded;
    }

    //method to add a ticket to the draw randonazing them
    public boolean buy() {
        boolean ticketAdddade = false;
        for (int i = 0; i < maxTickets; i++) {
            if (tickets[i] == null) {
                tickets[i] = new Ticket((int) (Math.random() * 5), (int) (Math.random() * 5));
                ticketAdddade = true;
            }
            sold++;
            break;
        }
        return ticketAdddade;
    }

    //checking by the number of winning tickets
    public int freqWinner(Ticket t) {
        int winnersCount = 0;
        int index = 0;
        while (tickets[index] != null) {
            if (tickets[index].a() == t.a() && tickets[index].b() == t.b()) {
                winnersCount++;
            }
            index++;
        }
        return winnersCount;


    }

    public Ticket[] getWinners(Ticket t) {
        Ticket[] winners = new Ticket[freqWinner((t))];
        int winnerIndex = 0;
        int index = 0;
        while (tickets[index] != null) {
            if (tickets[index].a() == t.a() && tickets[index].b() == t.b()) {
            }
            index++;
        }
        return winners;
    }

    public boolean search(Ticket t) {
        for (Ticket ticket : tickets) {
            if (ticket.a() == t.a() && ticket.b() == t.b()) {
                return true;
            }
        }
        return false;
    }

    public int sold() {
        return sold;
    }

    public boolean allsold() {
        return sold == maxTickets;
    }

    public String toString() {
        if (sold == 0) {
            return "[]";
            String s = "[";
            for (int j = 0; j < sold - 1; j++) {
                s = s + tickets[j] + ",";
            }
            return s + tickets[sold - 1] + "]";
        }
        return null;
    }

    public static void main(String[] args) {
        TicketManager tm = new TicketManager();

        System.out.println(tm);
        Ticket t1 = new Ticket((int) (Math.random() * 5), (int) (Math.random() * 5));
        tm.buy(t1);
        System.out.println(tm);
        Ticket t2 = new Ticket((int) (Math.random() * 5), (int) (Math.random() * 5));
        tm.buy(t2);
        System.out.println(tm);
        for (int j = 0; j < 200; j++) {
            tm.buy(new Ticket((int) (Math.random() * 5), (int) (Math.random() * 5)));
        }
        System.out.println(tm.sold());
        Ticket draw = new Ticket((int) (Math.random() * 5), (int) (Math.random() * 5));
        System.out.println(tm.freqWinner(draw));
        //Ticket[] t= tm.getWinners(draw);
        //for(Ticket tt:t){
        //System.out.println(tt);
        //}
    }
}
