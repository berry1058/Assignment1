package Homework;

public class MultiDimensionalArraysRoland {

	public static void main(String[] args) {

		String[][] myFavoriteThings = new String[4][2];

		// {"Lamb", "Steak", "Linkin Park", "Creed", "Harry Potter", "Hunger
		// Game", "Usual Suspects", "Star Wars"};

		myFavoriteThings[0][0] = "Lamb";
		myFavoriteThings[0][1] = "Steak";

		myFavoriteThings[1][0] = "Linkin Park";
		myFavoriteThings[1][1] = "Creed";

		myFavoriteThings[2][0] = "Harry Potter";
		myFavoriteThings[2][1] = "Hunger Games";

		myFavoriteThings[3][0] = "Usual Suspects";
		myFavoriteThings[3][1] = "The Big Leboski";

		int row = 4;
		int column = 2;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println(myFavoriteThings[i][j]);

			}

		}

	}
}
