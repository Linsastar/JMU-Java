import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String[] names = {"高俊锋", "申沛雨", "江明", "林德利", "王厚润"};
        NameDao nameDao = new NameDaoImpl();

        // test getNameFromArray
        List<String> nameList = nameDao.getNameFromArray(names);
        System.out.println("getNameFromArray test: ");
        System.out.println(Arrays.toString(names));
        System.out.println(nameList);

        // test searchName
        String targetName = "吴才湘";
        int index = nameDao.searchName(nameList, targetName);
        System.out.println("searchName test: ");
        if (index == -1) {
            System.out.println("Failed to find " + targetName);
        } else {
            System.out.println("Find " + targetName + " at index " + index);
        }

        // test removeFromList
        int idToRemove = 100;
        boolean result = nameDao.removeFromList(nameList, idToRemove);
        System.out.println("removeFromList test: ");
        if (result) {
            System.out.println("Succeeded to remove the item at index " + idToRemove);
            System.out.println(nameList);
        } else {
            System.out.println("Failed to remove the item at index " + idToRemove);
        }
    }
}
