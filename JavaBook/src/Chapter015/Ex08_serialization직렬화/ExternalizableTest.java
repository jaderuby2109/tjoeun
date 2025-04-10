package Chapter015.Ex08_serialization직렬화;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Dog implements Externalizable {

	String name;

	public Dog() {
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
	}

	public String toString() {
		return name;
	}
}

public class ExternalizableTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Dog myDog = new Dog();
		myDog.name = "멍멍이";

		try (FileOutputStream fos = new FileOutputStream("Chapter15\\external.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(myDog);
		}

		try (FileInputStream fis = new FileInputStream("Chapter15\\external.out");
				ObjectInputStream ois = new ObjectInputStream(fis);) {

			Dog dog = (Dog) ois.readObject();
			System.out.println(dog);
		}
	}
}
