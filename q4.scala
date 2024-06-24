object question4 {

    def main( args: Array[String]) = {

        def attendees(Ticket_p:Int):Int = {
            120 + (15 - Ticket_p)/5*20
        }

        def income(Ticket_p:Int):Int = {
            Ticket_p*attendees(Ticket_p)
        }

        def cost(Ticket_p:Int):Int = {
            500   + 3*attendees(Ticket_p)
        }

        def profit(Ticket_p:Int):Int = {
            income(Ticket_p) - cost(Ticket_p)
        }

        printf("Ticket price = Rs.10, Profit earned = %d\n",profit(10))
        printf("Ticket price = Rs.15, Profit earned = %d\n",profit(15))
        printf("Ticket price = Rs.20, Profit earned = %d\n",profit(20))
        printf("Ticket price = Rs.25, Profit earned = %d\n",profit(25))
        printf("Ticket price = Rs.30, Profit earned = %d\n",profit(30))
        printf("Ticket price = Rs.35, Profit earned = %d\n",profit(35))
        
        


    }
}