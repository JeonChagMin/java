package Chapter08;

import java.util.Scanner;

public class D0930_상속과추상화문제12 {

	public static void main(String[] args) {
		System.out.println("** Bear의 Fish 먹기 게임을 시작합니다.**");
		char[][] game = new char[10][20];
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[i].length; j++) {
				game[i][j]='-';
			}
		}
		Bear b = new Bear(0, 0, 1);
		Fish f = new Fish((int)(Math.random()*10),(int)(Math.random()*20), 1);
		game[b.x][b.y]=b.getShape();
		game[f.x][f.y]=f.getShape();
		while (true) {
			if (b.collide(f)==true) {
				System.out.println("Bear가 Fish를 먹었습니다.");
				game[b.x][b.y] = b.getShape();
				for (int i = 0; i < game.length; i++) {
					for (int j = 0; j < game[i].length; j++) {
						System.out.print(game[i][j]);
					}
					System.out.println();
				}
				System.out.println("Bear Wins!!!");
				break;
			}

			for (int i = 0; i < game.length; i++) {
				for (int j = 0; j < game[i].length; j++) {
					System.out.print(game[i][j]);
				}
				System.out.println();
			}
			game[b.x][b.y]='-';
			game[f.x][f.y]='-';
			b.move();
			f.move();
			game[b.x][b.y]=b.getShape();
			game[f.x][f.y]=f.getShape();

			}

	}
}

class Bear extends GameObject {

	Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	@Override
	void move() {
		System.out.println("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >> ");
		String direction = s.next();
		if (direction.equals("a")) {
			this.y -= this.distance;
			if (this.y < 0) {
				this.y = 0;
			}
		} else if (direction.equals("s")) {
			this.x += this.distance;
			if (this.x > 9) {
				this.x = 9;
			}
		} else if (direction.equals("d")) {
			this.x -= this.distance;
			if (this.x < 0) {
				this.x = 0;
			}
		} else if (direction.equals("f")) {
			this.y += this.distance;
			if (this.y > 19) {
				this.y = 19;
			}
		}
		play++;

	}

	@Override
	char getShape() {

		return 'B';
	}

}

class Fish extends GameObject {

	Fish(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	@Override
	void move() {
		char[] ox = new char[5];
		for (int i = 0; i < ox.length; i++) {
			if (i > 3) {
				ox[i] = 'X';
			} else {
				ox[i] = 'O';
			}
		}

		for (int i = 0; i < 10; i++) {
			int st = (int) (Math.random() * 5);
			int ed = (int) (Math.random() * 5);
			char imsi = ox[st];
			ox[st] = ox[ed];
			ox[ed] = imsi;
		}
		if (ox[play % 5] == 'O') {
			int go = (int) (Math.random() * 4);
			if (go == 0) {
				this.y -= this.distance;
				if (this.y < 0) {
					this.y = 0;
				}
			} else if (go == 1) {
				this.x += this.distance;
				if (this.x > 9) {
					this.x = 9;
				}
			} else if (go == 2) {
				this.x -= this.distance;
				if (this.x < 0) {
					this.x = 0;
				}
			} else if (go == 3) {
				this.y += this.distance;
				if (this.y > 19) {
					this.y = 19;
				}
			}

		}
		
		play++;


	}

	@Override
	char getShape() {
		return '@';
	}

}

abstract class GameObject {
	protected int distance;
	protected int x, y;
	protected char shape;
	int play = 0;
	Scanner s = new Scanner(System.in);
	GameObject(int startX, int startY, int distance) {
		this.x = startX;
		this.y = startY;
		this.distance = distance;
		}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	boolean collide(GameObject p) {
		if (this.x == p.getX() && this.y == p.getY()) {
			return true;
		} else {
			return false;
		}
	}

	abstract void move();

	abstract char getShape();
}
