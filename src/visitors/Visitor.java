package visitors;
import elements.Ramp;
import elements.Target;

public interface Visitor {
    void visit(Target target);
    void visit(Ramp ramp);

}