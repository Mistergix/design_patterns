public interface KingdomFactory { // abstract factory
    Castle createCastle();

    King createKing(); // for each "product", we defined a method

    Army createArmy();
}
