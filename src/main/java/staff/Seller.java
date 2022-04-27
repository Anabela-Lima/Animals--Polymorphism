package staff;

public interface Seller {           // interfaces dont have properties its abstract by default- you will never create an object so
                                    // youll never need a constructor to pass properties to obkect
                                    // access mod always public

    // interfaces just has method, not body i.e. interfaces have abstract methods

    String sellTicket();                // anything with seller interface  has to implement sell ticket method and has
                                        // to return a string -- see ticketseller




}
