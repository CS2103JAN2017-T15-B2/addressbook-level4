package seedu.address.testutil;

import seedu.address.commons.exceptions.IllegalValueException;
import seedu.address.model.tag.Tag;
import seedu.address.model.tag.UniqueTagList;
import seedu.address.model.task.Name;
import seedu.address.model.task.Priority;
import seedu.address.model.task.Status;
import seedu.address.model.task.Time;

/**
 *
 */
public class TaskBuilder {

    private TestTask task;

    public TaskBuilder() {
        this.task = new TestTask();
    }

    /**
     * Initializes the TaskBuilder with the data of {@code taskToCopy}.
     */
    public TaskBuilder(TestTask taskToCopy) {
        this.task = new TestTask(taskToCopy);
    }

    public TaskBuilder withName(String name) throws IllegalValueException {
        this.task.setName(new Name(name));
        return this;
    }

    //@@author A0143873Y
    public TaskBuilder withStartTime(String startTime) throws IllegalValueException {
        this.task.setStartTime(new Time(startTime));
        return this;
    }

    // needs special attention
    public TaskBuilder withEndTime(String endTime) throws IllegalValueException {
        this.task.setEndTime(new Time(endTime));
        return this;
    }
    //@@author

    public TaskBuilder withTags(String ... tags) throws IllegalValueException {
        task.setTags(new UniqueTagList());
        for (String tag: tags) {
            task.getTags().add(new Tag(tag));
        }
        return this;
    }

    //@@author A0119505J
    public TaskBuilder withPriority(String priority) throws IllegalValueException {
        this.task.setPriority(new Priority(priority));
        return this;
    }

    public TaskBuilder withStatus(int status) throws IllegalValueException {
        this.task.setStatus(new Status(status));
        return this;
    }


    public TestTask build() {
        return this.task;
    }

}
