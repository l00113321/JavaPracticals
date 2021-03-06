//Dermot McGee l00113321

package lyit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class JointFileHandler implements JointDao {

	private ArrayList<Joint> joints;
	private ObjectOutputStream os;
	private ObjectInputStream is;
	private File file = new File("joint.bin");

	public JointFileHandler() {
		joints = new ArrayList<Joint>();
	}

	public void add() {
		Joint j = new Joint();
		j.read();
		this.joints.add(j);
	}

	public void list() {

		for (Joint tmpJoint : joints)
			System.out.println(tmpJoint);
	}

	public void view() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		System.out.println("ENTER JOINT ACCOUNT NUMBER : ");
		int jointToView = keyboard.nextInt();

		for (Joint tmpJoint : joints) {

			if (tmpJoint.getAccountNumber() == jointToView) {

				System.out.println(tmpJoint);
				break;
			}
		}
	}

	public void edit() {
		list();
		for (Joint j : joints) {
			if (j != null) {
				int index = joints.indexOf(j);
				j.read();
				joints.set(index, j);
				break;
			}
		}
	}

	public void delete() {

		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		list();
		System.out.println("ENTER JOINT ACCOUNT NUMBER TO DELETE : ");
		int jointToView = keyboard.nextInt();

		for (Joint j : joints) {
			if (j.getAccountNumber() == jointToView) {
				this.joints.remove(j);
				break;
			}
		}
	}

	public void writeRecordsToFile() {
		try {
			os = new ObjectOutputStream(new FileOutputStream(file));
			os.writeObject(joints);

		} catch (Exception e) {

			System.out.println(e.getMessage());

		} finally {

			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@SuppressWarnings("unchecked")
	public void readRecordsFromFile() {

		if (file.exists()) {

			try {

				is = new ObjectInputStream(new FileInputStream(file));

				joints = (ArrayList<Joint>) is.readObject();

			} catch (Exception e) {

				System.out.println(e.getMessage());

			} finally {

				try {

					is.close();

				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		} else {

			try {
				file.createNewFile();

			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
}
