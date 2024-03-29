package rgt.constants;

public class RGTConstants {
	public static final int OUTPUT_FRAME_WIDTH = 700;
	public static final int OUTPUT_FRAME_HEIGHT = 620;
	public static final int DIALOG_WIDTH = 700;
	public static final int DIALOG_HEIGHT = 250;
	public static final int VERB_NOUN_INPUT_SIZE = 25;
	public static final int STEP_SEQUENCE_NUM_INPUT_SIZE = 4;
	public static final int ACTION_SEQUENCE_NUM_INPUT_SIZE = 4;
	public static final String TITLE = "Requirement Generator Tool";
	public static final String GENERATE = "Generate";
	public static final String  OUTPUT_FRAME_TITLE = TITLE + "-Edit View";
	public static final String OUTPUT_PANEL = "Output Panel";
	public static final String EDIT_FRAME_EDIT_OPTIONS = "Edit Optionss";
	public static final String UPDATE_DIALOG = "Update Dialog";
	public static final String ADD_BUSINESS_PROCESS_DIALOG = "Add Business Process Dialog";
	public static final String ADD_STEP_DIALOG = "Add Step Dialog";
	public static final String ADD_ACTION_DIALOG = "Add Action Dialog";
	public static final String[] DROPDOWN_VALUES = {RGTEntities.BUSINESS_PROCESS.getEntity(), RGTEntities.STEP.getEntity(), RGTEntities.ACTION.getEntity()};
	public static final String[] PRIORITY_VALUES = {"1","2","3","4","5"};
	public static final String TOOL_TIP_ADD_BUTTON = "Add a new business process, step or action";
	public static final String TOOL_TIP_DELETE_BUTTON = "Delete a business process, step or action";
	public static final String TOOL_TIP_UPDATE_BUTTON = "Update a business process, step or action";
	public static final String TOOL_TIP_EXPORT_BUTTON = "Export the requirements in the output panel";
	public static final String LABEL_COMBO_SELECT_BP = "Select a business process";
	public static final String LABEL_COMBO_SELECT_STEPS = "Select a step";
	public static String LABEL_COMBO_SELECT_ACTIONS = "Select an action";
	public static String DELETE_BUSINESS_PROCESS_DIALOG = "Delete Business Process Dialog";
	public static String DELETE_STEP_DIALOG = "Delete Step Dialog";
	public static String DELETE_ACTION_DIALOG = "Delete Action Dialog";
	public static String INFORMATION_TITLE = "Hint";
	public static final String LABEL_VERB_NOUN = "Verb Noun Phrase*";
	public static final String LABEL_STEP_SEQUENCE = "Step Sequence Number*";
	public static final String LABEL_ACTION_SEQUENCE = "Action Sequence Number*";
	public static final String LABEL_BUSINESS_PROCESS_PRIORITY = "Priority";
	public static final String UPDATE_DIALOG_BOX_TITLE = "Update Dialog Box";
	public static final String ADD_DIALOG_BOX_TITLE = "Add Dialog Box";
	public static final String DELETE_DIALOG_BOX_TITLE = "Delete Dialog Box";
	public static final String TOOLTIP_UPDATE_TAB1 = "Update the exisiting business processes";
	public static final String TOOLTIP_UPDATE_TAB2 = "Update the exisiting steps";
	public static final String TOOLTIP_UPDATE_TAB3 = "Update the exisiting actions";
	public static final String MESSAGE_BUSINESS_PROCESS_UPDATE = "Business process updated successfully. Do you want to update another business process?";
	public static final String MESSAGE_UPDATE_TITLE = "Successfully Updated!!";
	public static final String MESSAGE_BUSINESS_PROCESS_ADD = "Business process added successfully. Do you want to add another business process?";
	public static final String MESSAGE_ADD_TITLE = "Successfully Added!!";
	public static final String MESSAGE_DELETE_TITLE = "Successfully Deleted!!";
	public static final String MESSAGE_DELETE_ITEM = "Item successfully deleted";
	
	public static final String MESSAGE_CONFIRM_DIALOG_TITLE = "Confirmation Dialog";
	public static final String MESSAGE_CONFIRM_DELETE = "Are you sure you want to delete the selected item?";
	public static final String MESSAGE_STEP_ADD = "Step added successfully. Do you want to add another step?";
	public static final String MESSAGE_ACTION_ADD = "Action added successfully. Do you want to add another action?";
	public static final String TOOLTIP_ADD_TAB1 = "Add a new business process";
	public static final String TOOLTIP_ADD_TAB2 = "Add a new step";
	public static final String TOOLTIP_ADD_TAB3 = "Add a new action";
	public static final String VALIDATION_MESSAGE_SEQ_NUMBER = "Sequence number must be numeric";
	public static final String VALIDATION_MESSAGE_EMPTY_VERB_NOUN = "Verb noun text cannot be empty";
	public static final String VALIDATION_MESSAGE_BP_WITHOUT_STEPS = "Each business process must have atleast one step. Please add the step(s) to the business process";
	public static final String ERROR_TITLE = "Error";
	public static final int BUSINESS_PROCESS_TAB_INDEX = 0;
	public static final int STEP_TAB_INDEX = 1;
	public static final int ACTION_TAB_INDEX = 2;
	public static final String EMPTY = "";
	public static final String ERROR_NO_BUSINESSPROCESS= "You don't have any business process yet!";
	public static final String ERROR_NO_STEP= "You don't have any step yet!";
	public static final String ERROR_NO_ACTION= "You don't have any action yet!";
	public static final String DEFAULT_BP_COMBOBOX = "Select a business process";
	public static final String DEFAULT_STEP_COMBOBOX = "Select a step";
	public static final String DEFAULT_ACTION_COMBOBOX = "Select an action";
	public static final String VALIDATION_MESSAGE_EMPTY_COMBOBOX = "Please select a valid option from the dropdown";
}

