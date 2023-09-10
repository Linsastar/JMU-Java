import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class NameDaoImpl implements NameDao{
    @Override
    public List getNameFromArray(String[] names) {
        List<String> nameList = new ArrayList<>();
        ListIterator<String> iterator = nameList.listIterator();
        for (String name : names) {
            iterator.add(name);
        }
        return nameList;
    }

    @Override
    public int searchName(List nameList, String name) {
        return  nameList.indexOf(name);
    }

    @Override
    public boolean removeFromList(List nameList, int id) throws IllegalArgumentException {
        try {
            if (id < 0 || id >= nameList.size()) {
                throw new IllegalArgumentException();
            }
            nameList.remove(id);
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println("输入的id不合法");
            return false;
        }
    }
}
