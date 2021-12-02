package de.uniks.pmws2122.model;

public class ModelService {
    private Game game;

    public void buildGame(String playerNameOne, String playerNameTwo) {
        // create a new game
        this.game = new Game().setName("Epic battle");

        // create players
        Player alice = new Player().setName(playerNameOne).setColor("black");
        Player bob = new Player().setName(playerNameTwo).setColor("white");


        // create fields
        Field a1 = new Field().setCoordinate("a1");
        Field a4 = new Field().setCoordinate("a4");
        Field a7 = new Field().setCoordinate("a7");
        Field b2 = new Field().setCoordinate("b2");
        Field b4 = new Field().setCoordinate("b4");
        Field b6 = new Field().setCoordinate("b6");
        Field c3 = new Field().setCoordinate("c3");
        Field c4 = new Field().setCoordinate("c4");
        Field c5 = new Field().setCoordinate("c5");
        Field d1 = new Field().setCoordinate("d1");
        Field d2 = new Field().setCoordinate("d2");
        Field d3 = new Field().setCoordinate("d3");
        Field d5 = new Field().setCoordinate("d5");
        Field d6 = new Field().setCoordinate("d6");
        Field d7 = new Field().setCoordinate("d7");
        Field e3 = new Field().setCoordinate("e3");
        Field e4 = new Field().setCoordinate("e4");
        Field e5 = new Field().setCoordinate("e5");
        Field f2 = new Field().setCoordinate("f2");
        Field f4 = new Field().setCoordinate("f4");
        Field f6 = new Field().setCoordinate("f6");
        Field g1 = new Field().setCoordinate("g1");
        Field g4 = new Field().setCoordinate("g4");
        Field g7 = new Field().setCoordinate("g7");

        // positions in field
        a4.setBottom(a1).setTop(a7).setRight(b4);
        d7.setLeft(a7).setRight(g7).setBottom(d6);
        g4.setLeft(f4).setBottom(g1).setTop(g7);
        d1.setLeft(a1).setRight(g1).setTop(d2);
        b4.setLeft(a4).setTop(b6).setBottom(b2).setRight(c4);
        d2.setLeft(b2).setRight(f2).setTop(d3);
        f4.setLeft(e4).setBottom(f2).setTop(f6);
        d6.setLeft(b6).setRight(f6).setBottom(d5);
        c4.setTop(c5).setBottom(c3).setLeft(b4);
        d3.setLeft(c3).setRight(e3).setBottom(d2);
        e4.setBottom(e3).setTop(e5).setRight(f4);
        d5.setLeft(c5).setRight(e5).setTop(d6);

        // set players in game
        this.game.withPlayers(alice, bob);
        this.game.setCurrentPlayer(bob);
        bob.setNext(alice);

        //set fields in game
        this.game.withFields(a1, a4, a7, b2, b4, b6, c3, c4, c5,
                d1, d2, d3, d5, d6, d7, e3, e4, e5, f2, f4, f6, g1, g4, g7);

    }

    public Game getGame() {
        return this.game;
    }

}
