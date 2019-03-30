package LinearDS_Problems;

import DataStructure.List;
import DataStructure.Node;
import DataStructure.Queue;

//https://www.urionlinejudge.com.br/judge/en/problems/view/1851

public class HowToTrainYourDragon implements Node {
	public int dragonsDayTraining;
	private int dragonsDaySleep;
	public int pay;

	public HowToTrainYourDragon Dragon = null;

	public HowToTrainYourDragon(int dragonTraining, int daySleep) {
		this.setDayTraining(dragonTraining);
		this.setDragonsDaySleep(daySleep);
	}

	@Override
	public void setNext(Node node) {
		this.Dragon = (HowToTrainYourDragon) node;
	}

	@Override
	public Node getNext() {
		return Dragon;
	}

	@Override
	public Node clone() {
		HowToTrainYourDragon temp = new HowToTrainYourDragon(this.getDragons(), this.getDayTraining());
		return temp;
	}

	@Override
	public boolean isEqual(Node node) {
		HowToTrainYourDragon temp = (HowToTrainYourDragon) node;
		return this.getDayTraining() == temp.getDayTraining() ? true : false;
	}

	@Override
	public boolean isLessThan(Node node) {
		// TODO Auto-generated method stub
		return false;
	}

	public int getDragons() {
		return dragonsDayTraining;
	}

	public void setDragons(int dragons) {
		this.dragonsDayTraining = dragons;
	}

	public int getDayTraining() {
		return getDragonsDaySleep();
	}

	public void setDayTraining(int dayTraining) {
		this.setDragonsDaySleep(dayTraining);
	}

	public int getDragonsDaySleep() {
		return dragonsDaySleep;
	}

	public void setDragonsDaySleep(int dragonsDaySleep) {
		this.dragonsDaySleep = dragonsDaySleep;
	}

	//Method to calculate the total value of the fine pay
	public int solution(int t, int f) {
		int res = 0;
		List Training = new List();
		Queue Queue = new Queue();
		for (int i = 0; i < 5; i++) {
			Queue.enqueue(getNext());
			dragonsDayTraining=t;
			dragonsDaySleep=f;
		}

		Training.insertAtEnd(getNext());
		
		return res;
	}

}
