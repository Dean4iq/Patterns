package behavioral.iterator;

public class Tasks implements Container {
    private String[] tasks = {"Task 1", "Task 2", "Task 3"};

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }

    private class TaskIterator implements Iterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < tasks.length;
        }

        @Override
        public Object next() {
            return tasks[index++];
        }
    }
}
