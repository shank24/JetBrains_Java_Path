package DSA_Bootcamp.Assignments.Ass_01;

@FunctionalInterface
interface Operator<T> {
    T process(T a, T b);
}
