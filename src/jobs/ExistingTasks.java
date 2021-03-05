package jobs;

public class ExistingTasks {

	private String task_description;
	private double task_price;
	private int task_duration;
	private String department_name;

	/**
	 *
	 * @param task_description
	 */
	public void setTask_description(String task_description) {
		this.task_description = task_description;
	}

	public String getTask_description() {
		return this.task_description;
	}

	/**
	 *
	 * @param task_price
	 */
	public void setTask_price(double task_price) {
		this.task_price = task_price;
	}

	public double getTask_price() {
		return this.task_price;
	}

	/**
	 *
	 * @param task_duration
	 */
	public void setTask_duration(int task_duration) {
		this.task_duration = task_duration;
	}

	public int getTask_duration() { return this.task_duration; }

	/**
	 *
	 * @param department_name
	 */
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public String getDepartment_name() {
		return this.department_name;
	}

	/**
	 *
	 * @param task_description
	 * @param  task_price
	 * @param task_duration
	 * @param department_name
	 */
	public void saveTask(String task_description, double task_price, int task_duration, String department_name) {
		// TODO - implement ExistingTasks.saveTask
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param task_data
	 */
	public void extendTaskList(String task_data) {
		// TODO - implement ExistingTasksList.extendTaskList
		throw new UnsupportedOperationException();
	}

	public String[] retrieveExistingTask() {
		// TODO - implement ExistingTasksList.retrieveExistingTask
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param existing_task_ID
	 */
	public void removeExistingTask(int existing_task_ID) {
		// TODO - implement ExistingTasksList.removeExistingTask
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param existing_task_ID
	 */
	public void updateExistingTask(int existing_task_ID) {
		// TODO - implement ExistingTasksList.updateExistingTask
		throw new UnsupportedOperationException();
	}


	/**
	 *
	 * @param new_task_description
	 * @param new_task_price
	 * @param new_task_duration
	 * @param new_department_name
	 */
	public ExistingTasks(String new_task_description, double new_task_price, int new_task_duration, String new_department_name) {
		task_description = new_task_description;
		task_price = new_task_price;
		task_duration = new_task_duration;
		department_name = new_department_name;
	}

}