import java.util.List;

public interface NameDao {
    List getNameFromArray(String[] names);
    int searchName(List nameList, String name);
    boolean removeFromList(List nameList, int id);
}
