package de.uniks.pmws2122.model;

import org.fulib.builder.ClassModelDecorator;
import org.fulib.builder.ClassModelManager;
import org.fulib.builder.reflect.Link;

import java.util.ArrayList;

public class GenModel implements ClassModelDecorator
{
	class Game{
		String name;
		String phase;

		@Link("currentGame")
		Player currentPlayer;


		@Link("game")
		ArrayList<Player> players;

		@Link("game")
		ArrayList<Field> fields;

		@Link("game")
		ArrayList<Man> men;

		@Link("wonGame")
		Player winner;

	}

	class Player{
		String name;
		String color;
		String action;
		Integer initialPlacedMen;

		@Link("players")
		Game game;

		@Link("currentPlayer")
		Game currentGame;

		@Link("winner")
		Game wonGame;

		@Link("next")
		Player previous;

		@Link("previous")
		Player next;

		@Link("owner")
		ArrayList<Man> men;

	}

	class Man{
		String color;

		@Link("men")
		Game game;

		@Link("men")
		Field position;

		@Link("men")
		Player owner;

	}

	class Field{
		String coordinate;

		@Link("fields")
		Game game;

		@Link("right")
		Field left;

		@Link("left")
		Field right;

		@Link("top")
		Field bottom;

		@Link("bottom")
		Field top;

		@Link("position")
		Man men;



	}


	@Override
	public void decorate(ClassModelManager mm)
	{
		mm.haveNestedClasses(GenModel.class);
	}
}
