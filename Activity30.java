package Day3;
import java.io.*;
import java.util.*;
interface IAnimal {

void setId(int id);

int getId();

void setSpecies(String species);

String getSpecies();

void setName(String name);

String getName();

void setAge(int age);

int getAge();

}


interface IZoo {

void addAnimal(IAnimal animal);

void removeAnimal(int id);

int countAnimals();

List<IAnimal> getAnimalsBySpecies(String species);

List<Map.Entry<Integer, List<IAnimal>>> getAnimalsByAge();

}


class Animal implements IAnimal {

private int id;

private String species;

private String name;

private int age;


@Override

public void setId(int id) {

this.id = id;

}


public int getId() {

return id;

}


@Override

public void setSpecies(String species) {

this.species = species;

}


public String getSpecies() {

return species;

}


@Override

public void setName(String name) {

this.name = name;

}


public String getName() {

return name;

}


@Override

public void setAge(int age) {

this.age = age;

}


public int getAge() {

return age;

}

}


class Zoo implements IZoo {

private List<IAnimal> animals = new ArrayList<>();


@Override

public void addAnimal(IAnimal animal) {

animals.add(animal);

}
public void removeAnimal(int id) {

Iterator<IAnimal> iterator = animals.iterator();

while (iterator.hasNext()) {

IAnimal animal = iterator.next();

if (animal.getId() == id) {

iterator.remove();

}

}

}


@Override

public int countAnimals() {

return animals.size();

}


@Override

public List<IAnimal> getAnimalsBySpecies(String species) {

List<IAnimal> specAnimals = new ArrayList<>();

for (IAnimal animal : animals) {

if (animal.getSpecies().equals(species)) {

specAnimals.add(animal);

}

}

return specAnimals;

}


@Override

public List<Map.Entry<Integer, List<IAnimal>>> getAnimalsByAge() {

Map<Integer, List<IAnimal>> ageGroups = new HashMap<>();

for (IAnimal animal : animals) {

int age = animal.getAge();

ageGroups.putIfAbsent(age, new ArrayList<>());

ageGroups.get(age).add(animal);

}

List<Map.Entry<Integer, List<IAnimal>>> result = new ArrayList<>(ageGroups.entrySet());

//result.sort((o1, o2) -> o2.getKey().compareTo(o1.getKey()));

return result;

}

}


public class Activity30 {

public static void main(String[] args) throws IOException {

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

PrintWriter out = new PrintWriter(System.out);


IZoo zoo = new Zoo();

int aCount = Integer.parseInt(br.readLine().trim());

for (int i = 1; i <= aCount; i++) {

String[] a = br.readLine().trim().split(" ");

IAnimal e = new Animal();

e.setId(Integer.parseInt(a[0]));

e.setSpecies(a[1]);

e.setName(a[2]);

e.setAge(Integer.parseInt(a[3]));
zoo.addAnimal(e);

}


System.out.println("There are " + zoo.countAnimals() + " animals in the zoo");

String[] b = br.readLine().trim().split(" ");

String species = b[0];

List<IAnimal> specAnimals = zoo.getAnimalsBySpecies(species);

System.out.println(species + ":");

for (IAnimal sp : specAnimals) {

System.out.println("" + sp.getName() + " (" + sp.getAge() + " years old)");

}

List<Map.Entry<Integer, List<IAnimal>>> animalsByAge = zoo.getAnimalsByAge();

System.out.println("Animals by age:");

for (Map.Entry<Integer, List<IAnimal>> groups : animalsByAge) {
	System.out.println("" + groups.getKey() + " year(s) old:");

	for (IAnimal animal : groups.getValue()) {

	System.out.println("- " + animal.getName() + " (" + animal.getSpecies() + ")");

	}

	}

	String[] c = br.readLine().trim().split(" ");

	int id = Integer.parseInt(c[0]);

	zoo.removeAnimal(id);

	System.out.println("There are now " + zoo.countAnimals() + " animals in the zoo");


	System.out.flush();

	System.out.close();

	}

	}
