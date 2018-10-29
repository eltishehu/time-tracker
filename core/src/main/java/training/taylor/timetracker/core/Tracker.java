package training.taylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries;

    /**
     * @param TimeEntry entry
     * @returns void
     */
    public void add(TimeEntry entry) {
        entries.add(entry);
    }

    /**
     * @param TimeEntry entry
     * @returns void
     */
    public void remove(TimeEntry entry) {
        entries.remove(entry);
    }

    /**
     * @param null
     * @returns int The size of entries List
     */
    public int size() {
        return entries.size();
    }

    /**
     * @param int index of entries List
     * @returns TimeEntry object at the specified index in entries List
     */
    public TimeEntry get(int index) {
        return entries.get(index);
    }
}
