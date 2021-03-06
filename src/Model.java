import java.util.ArrayList;
import java.util.List;


/**
 * A Model is a set of truth assignments (a list of variables)
 * Representing a possible world
 * Author: Shuyang Liu
 */


public class Model
{
    private List<Variable> model;

    public Model()
    {
        this.model = new ArrayList<>();
    }

    public Model union(Variable v)
    {
        Model n = new Model();
        this.model.forEach(n::add);
        n.add(v);
        return n;
    }

    public void add(Variable v)
    {
        this.model.add(v);
    }

    public boolean find(String name)
    {
        for (Variable aModel : this.model) {
            if (aModel.getName().equals(name)) {
                return aModel.getValue();
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Model{" +"\n"+
                "model=" + model +"\n"+
                '}';
    }
}
