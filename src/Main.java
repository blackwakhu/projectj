import java.awt.*;
import javax.swing.*;

class Main{

    public String MFName, MUsername, MLName, GName, MEmail, MPhone;
    public int GID, MId, MAge, MRegFees, MRegMonth, MRegYear, MRegDay, MContribDay, MContribMonth, MContribYear, MLoanDay, MLoanMonth, MLoanYear;
    public int GRegFees, GRegDay, GRegMonth, GRegYear, GContribDay, GContribMonth, GContribYear, GLoanDay, GLoanMonth, GLoanYear;
    public float MLoan, MContribution, GContribution, GLoan, MShare;
    public String[] GMFName = new String[100];
    public String[] GMUsername = new String[100];
    public String[] GMLName = new String[100];
    public String[] GEmail = new String[100];
    public int[] GMMemberId = new int[100];
    public String[] GPhone = new String[100];
    public int GCounter = 0;
    private static final String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private static final GridBagConstraints gridbag19 = new GridBagConstraints();
    private static final GridBagConstraints gridbag13 = new GridBagConstraints();
    private static final GridBagConstraints gridbag25 = new GridBagConstraints();
    private static final JLabel GroupIndividualLoansStatusTitle = new JLabel("Group individual Loan status");
    private static final JLabel GroupIndividualLoansStatusIDLabel = new JLabel("enter the id");
    private static final JLabel GroupIndividualLoansStatusFNameLabel = new JLabel("first name");
    private static final GridBagConstraints gridbag27 = new GridBagConstraints();
    private static final JLabel GroupPenaltyPayTitle = new JLabel("member penalty pay");
    private static final JLabel GroupPenaltyPayIDLabel = new JLabel("enter your id");
    private static final JLabel GroupPenaltyPayAmountLabel = new JLabel("enter the amount");
    private static final JTextField GroupPenaltyPayIDEntry = new JTextField(10);
    private static final JTextField GroupPenaltyPayAmountEntry = new JTextField(10);
    private static final JButton GroupPenaltyPayResetButton = new JButton("reset");
    private static final JButton GroupPenaltyPaySubmitButton = new JButton("Submit");
    private static final JLabel GroupIndividualLoansStatusLNameLabel = new JLabel("last name");
    private static final JLabel GroupIndividualLoansStatusRepayLabel = new JLabel("loan remain");
    private static final JLabel GroupIndividualLoansStatusLoanLabel = new JLabel("loan amount");
    private static final JLabel GroupIndividualLoansStatusInterestLabel = new JLabel("interest");
    private static final JTextField GroupIndividualLoansStatusIDEntry = new JTextField(10);
    private static final JLabel GroupIndividualLoansStatusLNameEntry = new JLabel("");
    private static final JLabel GroupIndividualLoansStatusFNameEntry = new JLabel("");
    private static final JLabel GroupIndividualLoansStatusRepayEntry = new JLabel("");
    private static final JLabel GroupIndividualLoansStatusLoanEntry = new JLabel("");
    private static final JLabel GroupIndividualLoansStatusInterestEntry = new JLabel("");
    private static final JButton GroupIndividualLoansStatusSubmitButton = new JButton("Submit");
    private static final JLabel GroupLoansStatusTitle = new JLabel("Group loan status");
    private static final JLabel GroupLoansStatusIDLabel = new JLabel("enter the id");
    private static final JLabel GroupLoansStatusNameLabel = new JLabel("group name");
    private static final JLabel GroupLoansStatusRepayLabel = new JLabel("loan remain");
    private static final JLabel GroupLoansStatusLoanLabel = new JLabel("loan amount");
    private static final JLabel GroupLoansStatusInterestLabel = new JLabel("interest");
    private static final JTextField GroupLoansStatusIDEntry = new JTextField(10);
    private static final JLabel GroupLoansStatusNameEntry = new JLabel("");
    private static final JLabel GroupLoansStatusRepayEntry = new JLabel("");
    private static final JLabel GroupLoansStatusLoanEntry = new JLabel("");
    private static final JLabel GroupLoansStatusInterestEntry = new JLabel("");
    private static final JButton GroupLoansStatusSubmitButton = new JButton("Submit");
    private static final GridBagConstraints gridbag12 = new GridBagConstraints();
    private static final JLabel MemberLoansStatusTitle = new JLabel("member Loans status");
    private static final JLabel MemberLoansStatusIDLabel = new JLabel("enter the id");
    private static final JLabel MemberLoansStatusFNameLabel = new JLabel("first name");
    private static final JLabel MemberLoansStatusLNameLabel = new JLabel("last name");
    private static final JLabel MemberLoansStatusRepayLabel = new JLabel("loan remain");
    private static final JLabel MemberLoansStatusLoanLabel = new JLabel("loan amount");
    private static final JLabel MemberLoansStatusInterestLabel = new JLabel("interest");
    private static final JTextField MemberLoansStatusIDEntry = new JTextField(10);
    private static final JLabel MemberLoansStatusFNameEntry = new JLabel("");
    private static final JLabel MemberLoansStatusLNameEntry = new JLabel("");
    private static final JLabel MemberLoansStatusRepayEntry = new JLabel("");
    private static final JLabel MemberLoansStatusLoanEntry = new JLabel("");
    private static final JLabel MemberLoansStatusInterestEntry = new JLabel("");
    private static final JButton MemberLoansStatusSubmitButton = new JButton("Submit");
    private static final GridBagConstraints gridbag9 = new GridBagConstraints();
    private static final JLabel GroupLoansBorrowedTitle = new JLabel("Group Loans");
    private static final JLabel GroupLoansBorrowedIdLabel = new JLabel("enter your group id");
    private static final JLabel GroupLoansBorrowedLoanLabel = new JLabel("enter the loan");
    private static final JLabel GroupLoansBorrowedDayLabel = new JLabel("day");
    private static final JLabel GroupLoansBorrowedMonthLabel = new JLabel("month");
    private static final JLabel GroupLoansBorrowedYearLabel = new JLabel("year");
    private static final JTextField GroupLoansBorrowedIdEntry = new JTextField(10);
    private static final JTextField GroupLoansBorrowedLoansEntry = new JTextField(10);
    private static final JSpinner GroupLoansBorrowedDayEntry = new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
    private static final JComboBox GroupLoansBorrowedMonthEntry = new JComboBox(months);
    private static final JSpinner GroupLoansBorrowedYearEntry = new JSpinner(new SpinnerNumberModel(2000, 2000, 2100, 1));
    private static final JButton GroupLoansBorrowedSubmitButton = new JButton("Submit");
    private static final JButton GroupLoansBorrowedResetButton = new JButton("Reset");
    private static final GridBagConstraints gridbag10 = new GridBagConstraints();
    private static final GridBagConstraints gridbag8 = new GridBagConstraints();
    private static final JLabel MemberLoansBorrowedTitle = new JLabel("Member Loans");
    private static final JLabel MemberLoansBorrowedIdLabel = new JLabel("enter your id");
    private static final JLabel MemberLoansBorrowedLoanaLabel = new JLabel("enter the loan");
    private static final JLabel MemberLoansBorrowedDayLabel = new JLabel("day");
    private static final JLabel MemberLoansBorrowedMonthLabel = new JLabel("month");
    private static final JLabel MemberLoansBorrowedYearLabel = new JLabel("year");
    private static final JTextField MemberLoansBorrowedIdEntry = new JTextField(10);
    private static final JTextField MemberLoansBorrowedLoansEntry = new JTextField(10);
    private static final JSpinner MemberLoansBorrowedDayEntry = new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
    private static final JComboBox MemberLoansBorrowedMonthEntry = new JComboBox(months);
    private static final JSpinner MemberLoansBorrowedYearEntry = new JSpinner(new SpinnerNumberModel(2000, 2000, 2100, 1));
    private static final JButton MemberLoansBorrowedSubmitButton = new JButton("Submit");
    private static final JButton MemberLoansBorrowedResetButton = new JButton("Reset");
    private static final JLabel MemberLoansPayTitle = new JLabel("Member pay");
    private static final JLabel MemberLoansPayIdLabel = new JLabel("enter your id");
    private static final JLabel MemberLoansPayPayLabel = new JLabel("enter the cash");
    private static final JLabel MemberLoansPayDayLabel = new JLabel("day");
    private static final JLabel MemberLoansPayMonthLabel = new JLabel("month");
    private static final JLabel MemberLoansPayYearLabel = new JLabel("year");
    private static final JTextField MemberLoansPayIdEntry = new JTextField(10);
    private static final JTextField MemberLoansPayPayEntry = new JTextField(10);
    private static final JSpinner MemberLoansPayDayEntry = new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
    private static final JComboBox MemberLoansPayMonthEntry = new JComboBox(months);
    private static final JSpinner MemberLoansPayYearEntry = new JSpinner(new SpinnerNumberModel(2000, 2000, 2100, 1));
    private static final JButton MemberLoansPaySubmitButton = new JButton("Submit");
    private static final JButton MemberLoansPayResetButton = new JButton("Reset");
    private static final GridBagConstraints gridbag21 = new GridBagConstraints();
    private static final JLabel GroupPenaltyStatusTitle = new JLabel("group penalty status");
    private static final JLabel GroupPenaltyStatusIDLabel = new JLabel("enter the id");
    private static final JLabel GroupPenaltyStatusNameLabel = new JLabel("group name");
    private static final JLabel GroupPenaltyStatusPenaltyLabel = new JLabel("penalty");
    private static final JTextField GroupPenaltyStatusIDEntry = new JTextField(10);
    private static final JLabel GroupPenaltyStatusNameEntry = new JLabel("");
    private static final JLabel GroupPenaltyStatusPenaltyEntry = new JLabel("");
    private static final JButton GroupPenaltyStatusSubmitButton = new JButton("Submit");
    private static final GridBagConstraints gridbag11 = new GridBagConstraints();
    private static final GridBagConstraints gridbag14 = new GridBagConstraints();
    private static final JLabel GroupIndividualLoansBorrowedTitle = new JLabel("Group Individual Loans");
    private static final JLabel GroupIndividualLoansBorrowedIdLabel = new JLabel("enter your id");
    private static final JLabel GroupIndividualLoansBorrowedLoanLabel = new JLabel("enter the loan");
    private static final JLabel GroupIndividualLoansBorrowedDayLabel = new JLabel("day");
    private static final JLabel GroupIndividualLoansBorrowedMonthLabel = new JLabel("month");
    private static final JLabel GroupIndividualLoansBorrowedYearLabel = new JLabel("year");
    private static final JTextField GroupIndividualLoansBorrowedIdEntry = new JTextField(10);
    private static final JTextField GroupIndividualLoansBorrowedLoanEntry = new JTextField(10);
    private static final JSpinner GroupIndividualLoansBorrowedDayEntry = new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
    private static final JComboBox GroupIndividualLoansBorrowedMonthEntry = new JComboBox(months);
    private static final JSpinner GroupIndividualLoansBorrowedYearEntry = new JSpinner(new SpinnerNumberModel(2000, 2000, 2100, 1));
    private static final JButton GroupIndividualLoansBorrowedSubmitButton = new JButton("Submit");
    private static final JButton GroupIndividualLoansBorrowedResetButton = new JButton("Reset");
    private static final JLabel GroupLoansPayTitle = new JLabel("Group pay");
    private static final JLabel GroupLoansPayIdLabel = new JLabel("enter the group id");
    private static final JLabel GroupLoansPayPayLabel = new JLabel("enter the cash");
    private static final JLabel GroupLoansPayDayLabel = new JLabel("day");
    private static final JLabel GroupLoansPayMonthLabel = new JLabel("month");
    private static final JLabel GroupLoansPayYearLabel = new JLabel("Year");
    private static final JTextField GroupLoansPayIdEntry = new JTextField(10);
    private static final JTextField GroupLoansPayPayEntry = new JTextField(10);
    private static final JSpinner GroupLoansPayDayEntry = new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
    private static final JSpinner GroupLoansPayYearEntry = new JSpinner(new SpinnerNumberModel(2000, 2000, 2100, 1));
    private static final JComboBox GroupLoansPayMonthEntry = new JComboBox(months);
    private static final JButton GroupLoansPaySubmitButton = new JButton("Submit");
    private static final JButton GroupLoansPayResetButton = new JButton("Reset");
    private static final JLabel GroupIndividualLoansPayTitle = new JLabel("Group individual pay");
    private static final JLabel GroupIndividualLoansPayIdLabel = new JLabel("enter your id");
    private static final JLabel GroupIndividualLoansPayPayLabel = new JLabel("enter the cash");
    private static final JLabel GroupIndividualLoansPayDayLabel = new JLabel("day");
    private static final JLabel GroupIndividualLoansPayMonthLabel = new JLabel("month");
    private static final JLabel GroupIndividualLoansPayYearLabel = new JLabel("Year");
    private static final JTextField GroupIndividualLoansPayIdEntry = new JTextField(10);
    private static final JTextField GroupIndividualLoansPayPayEntry = new JTextField(10);
    private static final JSpinner GroupIndividualLoansPayDayEntry = new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
    private static final JSpinner GroupIndividualLoansPayYearEntry = new JSpinner(new SpinnerNumberModel(2000, 2000, 2100, 1));
    private static final JComboBox GroupIndividualLoansPayMonthEntry = new JComboBox(months);
    private static final JButton GroupIndividualLoansPaySubmitButton = new JButton("Submit");
    private static final JButton GroupIndividualLoansPayResetButton = new JButton("Reset");
    private static final JLabel titleLabel = new JLabel("WELCOME TO THE MWANZO BARAKA\n");
    private static final JButton registrationbutton = new JButton("New ");
    private static final JButton contributionbutton = new JButton("Contribution ");
    private static final JButton loanbutton = new JButton("loan");
    private static final JButton reportbutton = new JButton("reports");
    private static final JButton memberreg = new JButton("new member ");
    private static final JButton groupreg = new JButton("new group");
    private static final JButton membercontrib = new JButton("new member contribution");
    private static final JButton groupcontrib = new JButton("new group contribution");
    private static final JButton membercontribstatus = new JButton("member contribution status");
    private static final JButton groupcontribstatus = new JButton("group contribution status");
    private static final JButton groupindividualcontribstatus = new JButton("individual group contribution status");
    private static final JButton memberborrow = new JButton("member borrow");
    private static final JButton groupborrow = new JButton("group borrow");
    private static final JButton groupindividualborrow = new JButton("group individual borrow");
    private static final JButton memberpay = new JButton("member pay");
    private static final JButton grouppay = new JButton("group pay");
    private static final JButton groupindividualpay = new JButton("group individual pay");
    private static final JButton memberpaystatus = new JButton("member pay status");
    private static final JButton grouppaystatus = new JButton("group pay status");
    private static final JButton groupindividualpaystatus = new JButton("group individual pay status");
    private static final JButton memberpenalty = new JButton("member pay penalty");
    private static final JButton grouppaypenalty= new JButton("group pay penalty");
    private static final JButton groupindividualpenalty = new JButton("group individual pay penalty");
    private static final JButton memberpenaltystatus = new JButton("member penalty status");
    private static final JButton grouppenaltystatus = new JButton("group penalty status");
    private static final JButton groupindividualpenaltystatus = new JButton("group individual penalty status");
    private static final JButton memberincomestatus = new JButton("member dividends");
    private static final JButton groupincomestatus = new JButton("group dividends");
    private static final JButton groupindividualincomestatus = new JButton("group individual dividends");
    private static final JLabel MemberRegistrationTitle = new JLabel("Member Registration");
    private static final JLabel MemberRegistrationIdLabel = new JLabel("enter your id");
    private static final JLabel MemberRegistrationUNameLabel = new JLabel("enter your Username");
    private static final JLabel MemberRegistrationFNameLabel = new JLabel("enter your First name");
    private static final JLabel MemberRegistrationLNameLabel = new JLabel("enter your Last name");
    private static final JLabel MemberRegistrationDayLabel = new JLabel("day");
    private static final JLabel MemberRegistrationMonthLabel = new JLabel("Month");
    private static final JLabel MemberRegistrationYearLabel = new JLabel("Year");
    private static final JLabel MemberRegistrationAgeLabel = new JLabel("enter your age");
    private static final JLabel MemberRegistrationRFeesLabel = new JLabel("enter the Registration fees");
    private static final JLabel MemberRegistrationMEmailLabel = new JLabel("enter the email");
    private static final JLabel MemberRegistrationMPhoneLabel = new JLabel("enter the phone");
    private static final GridBagConstraints gridbag = new GridBagConstraints();
    private static final JTextField MemberRegistrationIdEntry = new JTextField(10);
    private static final JTextField MemberRegistrationUNameEntry = new JTextField(10);
    private static final JTextField MemberRegistrationFNameEntry = new JTextField(10);
    private static final JTextField MemberRegistrationLNameEntry = new JTextField(10);
    private static final JComboBox MemberRegistrationMonthEntry = new JComboBox(months);
    private static final JSpinner MemberRegistrationYearEntry = new JSpinner(new SpinnerNumberModel(2000, 2000, 2100, 1));
    private static final JSpinner MemberRegistrationDayEntry = new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
    private static final JTextField MemberRegistrationAgeEntry = new JTextField(10);
    private static final JTextField MemberRegistrationRFeesEntry = new JTextField(10);
    private static final JTextField MemberRegistrationMEmailEntry = new JTextField(10);
    private static final JTextField MemberRegistrationMPhoneEntry = new JTextField(10);
    private static final JButton MemberRegistrationSubmitButton = new JButton("Submit");
    private static final JButton MemberRegistrationResetButton = new JButton("Reset");
    private static final JFrame frame = new JFrame("hello world");
    private static final CardLayout card = new CardLayout();
    private static final JPanel mainPanel = new JPanel();
    private static final JMenuBar mbr = new JMenuBar();
    private static final JMenu NewRegistration = new JMenu("Registration");
    private static final JMenuItem MemberRegistration = new JMenuItem("Members");
    private static final JPanel MemberRegistrationPanel = new JPanel();
    private static final GridBagConstraints gridbag1 = new GridBagConstraints();
    private static final JLabel GroupRegistrationTitle = new JLabel("Group Registration");
    private static final JLabel GroupRegistrationUNameLabel = new JLabel("enter your Username");
    private static final JLabel GroupRegistrationFNameLabel = new JLabel("enter your First name");
    private static final JLabel GroupRegistrationLNameLabel = new JLabel("enter your Last name");
    private static final JLabel GroupRegistrationDayLabel = new JLabel("day");
    private static final JLabel GroupRegistrationMonthLabel = new JLabel("month");
    private static final JLabel GroupRegistrationYearLabel = new JLabel("year");
    private static final JLabel GroupRegistrationMemberIdLabel = new JLabel("enter the member id");
    private static final JLabel GroupRegistrationRFeesLabel = new JLabel("enter the Registration fees");
    private static final JLabel GroupRegistrationEmailLabel = new JLabel("enter the email");
    private static final JLabel GroupRegistrationPhoneLabel = new JLabel("enter the phone number");
    private static final JLabel GroupRegistrationGNameLabel = new JLabel("enter the group name");
    private static final JLabel GroupRegistrationGIDLabel = new JLabel("enter the group id");
    private static final JTextField GroupRegistrationGIDEntry = new JTextField(10);
    private static final JTextField GroupRegistrationGNameEntry = new JTextField(10);
    private static final JTextField GroupRegistrationUNameEntry = new JTextField(10);
    private static final JTextField GroupRegistrationFNameEntry = new JTextField(10);
    private static final JTextField GroupRegistrationLNameEntry = new JTextField(10);
    private static final JTextField GroupRegistrationRFeesEntry = new JTextField(10);
    private static final JComboBox GroupRegistrationMonthEntry = new JComboBox(months);
    private static final JTextField GroupRegistrationMemberIdEntry = new JTextField(10);
    private static final JSpinner GroupRegistrationYearEntry = new JSpinner(new SpinnerNumberModel(2000, 2000, 2100, 1));
    private static final JSpinner GroupRegistrationDayEntry = new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
    private static final JTextField GroupRegistrationEmailEntry = new JTextField(10);
    private static final JTextField GroupRegistrationPhoneEntry = new JTextField(10);
    private static final JButton GroupRegistrationAddButton = new JButton("Add");
    private static final JButton GroupRegistrationSubmitButton = new JButton("Submit");
    private static final JButton GroupRegistrationResetButton = new JButton("Reset");
    private static final JPanel GroupRegistrationPanel = new JPanel();
    private static final JMenuItem GroupRegistration = new JMenuItem("Group");
    private static final JMenu NewContribution = new JMenu("Contribution");
    private static final JMenu Contribution = new JMenu("Payment");
    private static final JMenuItem MemberContribution = new JMenuItem("Member");
    private static final JPanel MemberContributionPanel = new JPanel();
    private static final GridBagConstraints gridbag4 = new GridBagConstraints();
    private static final JLabel MemberContributionTitle = new JLabel("Member Contribution");
    private static final JLabel MemberContributionIDLabel = new JLabel("enter your id");
    private static final JLabel MemberContributionContributionLabel = new JLabel("enter your Contribution");
    private static final JLabel MemberContributionDayLabel = new JLabel("day");
    private static final JLabel MemberContributionMonthLabel = new JLabel("month");
    private static final JLabel MemberContributionYearLabel = new JLabel("year");
    private static final JTextField MemberContributionIDEntry = new JTextField(10);
    private static final JTextField MemberContributionContributionEntry = new JTextField(10);
    private static final JSpinner MemberContributionDayEntry = new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
    private static final JComboBox MemberContributionMonthEntry = new JComboBox(months);
    private static final JSpinner MemberContributionYearEntry = new JSpinner(new SpinnerNumberModel(2000, 2000, 2100, 1));
    private static final JButton MemberContributionSubmitButton = new JButton("Submit");
    private static final JButton MemberContributionResetButton = new JButton("Reset");
    private static final JMenuItem GroupContribution = new JMenuItem("Group");
    private static final GridBagConstraints gridbag5 = new GridBagConstraints();
    private static final JLabel GroupContributionTitle = new JLabel("Group Contribution");
    private static final JLabel GroupContributionGroupIdLabel = new JLabel("enter the group id");
    private static final JLabel GroupContributionMemberIdLabel = new JLabel("enter your id");
    private static final JLabel GroupContributionContributionLabel = new JLabel("enter the contribution");
    private static final JLabel GroupContributionDayLabel = new JLabel("day");
    private static final JLabel GroupContributionMonthLabel = new JLabel("month");
    private static final JLabel GroupContributionYearLabel = new JLabel("year");
    private static final JTextField GroupContributionGroupIdEntry = new JTextField(10);
    private static final JTextField GroupContributionMemberIdEntry = new JTextField(10);
    private static final JTextField GroupContributionContributionEntry = new JTextField(10);
    private static final JSpinner GroupContributionDayEntry = new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
    private static final JComboBox GroupContributionMonthEntry = new JComboBox(months);
    private static final JSpinner GroupContributionYearEntry = new JSpinner(new SpinnerNumberModel(2000, 2000, 2100, 1));
    private static final JButton GroupContributionSubmitButton = new JButton("Submit");
    private static final JButton GroupContributionResetButton = new JButton("Reset");
    private static final JPanel GroupContributionPanel = new JPanel();
    private static final JMenu NewContributionStatus = new JMenu("Share status");
    private static final JMenuItem MemberContributionStatus = new JMenuItem("Member");
    private static final JLabel MemberContributionStatusTitle = new JLabel("Member ContributionStatus");
    private static final JLabel MemberContributionStatusidLabel = new JLabel("enter your id");
    private static final JLabel MemberContributionStatusFNameLabel = new JLabel("first name");
    private static final JLabel MemberContributionStatusLNameLabel = new JLabel("last name");
    private static final JLabel MemberContributionStatusUnameLabel = new JLabel("username");
    private static final JLabel MemberContributionStatusSharesLabel = new JLabel("shares");
    private static final JLabel MemberContributionStatusSharesResultLabel = new JLabel("");
    private static final JLabel MemberContributionStatusResultUnameLabel = new JLabel("");
    private static final JLabel MemberContributionStatusResultFNameLabel = new JLabel("");
    private static final JLabel MemberContributionStatusResultLNameLabel = new JLabel("");
    private static final JTextField MemberContributionStatusIdEntry = new JTextField(10);
    private static final JButton MemberContributionStatusSubmitButton = new JButton("Submit");
    private static final GridBagConstraints gridbag6 = new GridBagConstraints();
    private static final JPanel MemberContributionStatusPanel = new JPanel();
    private static final GridBagConstraints gridbag7 = new GridBagConstraints();
    private static final JLabel GroupContributionStatusTitle = new JLabel("Group Contribution");
    private static final JLabel GroupContributionStatusGIdLabel = new JLabel("enter the group id");
    private static final JLabel GroupContributionStatusGNameLabel = new JLabel("group name");
    private static final JLabel GroupContributionStatusSharesLabel = new JLabel("shares");
    private static final JTextField GroupContributionStatusGIdEntry = new JTextField(10);
    private static final JLabel GroupContributionStatusResultGNameLabel = new JLabel("");
    private static final JLabel GroupContributionStatusResultSharesLabel = new JLabel("");
    private static final JButton GroupContributionStatusSubmitButton = new JButton("Submit");
    private static final GridBagConstraints gridbag20 = new GridBagConstraints();
    private static final JLabel GroupContributionIndividualStatusTitle = new JLabel("Group Contribution");
    private static final JLabel GroupContributionIndividualStatusIdLabel = new JLabel("enter your id");
    private static final JLabel GroupContributionIndividualStatusUnameLabel = new JLabel("username");
    private static final JLabel GroupContributionIndividualStatusFnameLabel = new JLabel("first name");
    private static final JLabel GroupContributionIndividualStatusLnameLabel = new JLabel("last name");
    private static final JLabel GroupContributionIndividualStatusSharesLabel = new JLabel("shares");
    private static final JTextField GroupContributionIndividualStatusIdEntry = new JTextField(10);
    private static final JLabel GroupContributionIndividualStatusResultUnameLabel = new JLabel("");
    private static final JLabel GroupContributionIndividualStatusResultFnameLabel = new JLabel("");
    private static final JLabel GroupContributionIndividualStatusResultLnameLabel = new JLabel("");
    private static final JLabel GroupContributionIndividualStatusResultSharesLabel = new JLabel("");
    private static final JButton GroupContributionIndividualStatusSubmitButton = new JButton("Submit");
    private static final JPanel firstPage = new JPanel();
    private static final JPanel reportPage = new JPanel();
    private static final JPanel contentpage  = new JPanel();
    private static final JPanel registrationpage = new JPanel();
    private static final JPanel contributionpage = new JPanel();
    private static final JPanel loanpage = new JPanel();
    private static final GridBagConstraints gridbag30 = new GridBagConstraints();
    private static final JLabel GroupIndividualDividendsTitle = new JLabel("group individual dividends");
    private static final JLabel GroupIndividualDividendsIDLabel = new JLabel("enter the id");
    private static final JLabel GroupIndividualDividendsFNameLabel = new JLabel("first name");
    private static final JLabel GroupIndividualDividendsLNameLabel = new JLabel("last name");
    private static final JLabel GroupIndividualDividendsDividendsLabel = new JLabel("dividend");
    private static final JTextField GroupIndividualDividendsIDEntry = new JTextField(10);
    private static final JLabel GroupIndividualDividendsFNameEntry = new JLabel("");
    private static final JLabel GroupIndividualDividendsLNameEntry = new JLabel("");
    private static final JLabel GroupIndividualDividendsDividendsEntry = new JLabel("");
    private static final JButton GroupIndividualDividendsSubmitButton = new JButton("Submit");
    private static final GridBagConstraints gridbag26 = new GridBagConstraints();
    private static final JLabel MemberPenaltyPayPanelTitle = new JLabel("member penalty pay");
    private static final JLabel MemberPenaltyPayPanelIDLabel = new JLabel("enter your id");
    private static final JLabel MemberPenaltyPayPanelAmountLabel = new JLabel("enter the amount");
    private static final JTextField MemberPenaltyPayPanelIDEntry = new JTextField(10);
    private static final JTextField MemberPenaltyPayPanelAmountEntry = new JTextField(10);
    private static final JButton MemberPenaltyPayPanelResetButton = new JButton("reset");
    private static final JButton MemberPenaltyPayPanelSubmitButton = new JButton("Submit");
    private static final GridBagConstraints gridbag24 = new GridBagConstraints();
    private static final JLabel GroupDividendsTitle = new JLabel("group dividends");
    private static final JLabel GroupDividendsIDLabel = new JLabel("enter the id");
    private static final JLabel GroupDividendsNameLabel = new JLabel("group name");
    private static final JLabel GroupDividendsDividendsLabel = new JLabel("dividend");
    private static final JTextField GroupDividendsIDEntry = new JTextField(10);
    private static final JLabel GroupDividendsNameEntry = new JLabel("");
    private static final JLabel GroupDividendsDividendsEntry = new JLabel("");
    private static final JButton GroupDividendsSubmitButton = new JButton("Submit");
    private static final GridBagConstraints gridbag23 = new GridBagConstraints();
    private static final JLabel MemberDividendsTitle = new JLabel("member dividends");
    private static final JLabel MemberDividendsIDLabel = new JLabel("enter the id");
    private static final JLabel MemberDividendsFNameLabel = new JLabel("first name");
    private static final JLabel MemberDividendsLNameLabel = new JLabel("last name");
    private static final JLabel MemberDividendsDividendsLabel = new JLabel("dividends");
    private static final JTextField MemberDividendsIDEntry = new JTextField(10);
    private static final JLabel MemberDividendsFNameEntry = new JLabel("");
    private static final JLabel MemberDividendsLNameEntry = new JLabel("");
    private static final JLabel MemberDividendsDividendsEntry = new JLabel("");
    private static final JButton MemberDividendsSubmitButton = new JButton("Submit");
    private static final GridBagConstraints gridbag22 = new GridBagConstraints();
    private static final JLabel GroupIndividualPenaltyStatusTitle = new JLabel("group individual penalty status");
    private static final JLabel GroupIndividualPenaltyStatusIDLabel = new JLabel("enter the id");
    private static final JLabel GroupIndividualPenaltyStatusFNameLabel = new JLabel("first name");
    private static final JLabel GroupIndividualPenaltyStatusLNameLabel = new JLabel("last name");
    private static final JLabel GroupIndividualPenaltyStatusPenaltyLabel = new JLabel("penalty");
    private static final JTextField GroupIndividualPenaltyStatusIDEntry = new JTextField(10);
    private static final JLabel GroupIndividualPenaltyStatusFNameEntry = new JLabel("");
    private static final JLabel GroupIndividualPenaltyStatusLNameEntry = new JLabel("");
    private static final JLabel GroupIndividualPenaltyStatusPenaltyEntry = new JLabel("");
    private static final JButton GroupIndividualPenaltyStatusSubmitButton = new JButton("Submit");
    private static final JMenuItem GroupContributionStatus = new JMenuItem("Group");
    private static final JPanel GroupContributionStatusPanel = new JPanel();
    private static final JMenuItem GroupContributionIndividualStatus = new JMenuItem("Group Individual");
    private static final JPanel GroupContributionIndividualStatusPanel = new JPanel();
    private static final JMenu NewLoans = new JMenu("Loans");
    private static final JMenu NewLoansBorrowed = new JMenu("Borrow");
    private static final JMenuItem MemberLoansBorrowed = new JMenuItem("Member");
    private static final JPanel MemberLoansBorrowedPanel = new JPanel();
    private static final JMenuItem GroupLoansBorrowed = new JMenuItem("Group");
    private static final JPanel GroupLoansBorrowedPanel = new JPanel();
    private static final JMenuItem GroupIndividualLoansBorrowed = new JMenuItem("Group individual");
    private static final JPanel GroupIndividualLoansBorrowedPanel = new JPanel();
    private static final JMenu NewLoansPay = new JMenu("Payment");
    private static final JMenuItem MemberLoansPay = new JMenuItem("Member");
    private static final JPanel MemberLoansPayPanel = new JPanel();
    private static final JMenuItem GroupLoansPay = new JMenuItem("Group");
    private static final JPanel GroupLoansPayPanel = new JPanel();
    private static final JMenuItem GroupIndividualLoansPay = new JMenuItem("individual ");
    private static final JPanel GroupIndividualLoansPayPanel = new JPanel();
    private static final JMenu NewLoansStatus = new JMenu("Loan status");
    private static final JMenuItem MemberLoansStatus = new JMenuItem("Member");
    private static final JPanel MemberLoansStatusPanel = new JPanel();
    private static final JMenuItem GroupLoansStatus = new JMenuItem("Group");
    private static final JPanel GroupLoansStatusPanel = new JPanel();
    private static final JMenuItem GroupIndividualLoansStatus = new JMenuItem("Group Individual");
    private static final JPanel GroupIndividualLoansStatusPanel = new JPanel();
    private static final JMenu NewReports = new JMenu("Reports");
    private static final JMenu NewPenaltyPay = new JMenu("penalty pay");
    private static final JMenuItem MemberPenaltyPay = new JMenuItem("member");
    private static final JPanel MemberPenaltyPayPanel = new JPanel();
    private static final JMenuItem GroupPenaltyPay = new JMenuItem("group");
    private static final JPanel GroupPenaltyPayPanel = new JPanel();
    private static final JMenuItem GroupIndividualPenaltyPay = new JMenuItem("individual");
    private static final JPanel GroupIndividualPenaltyPayPanel = new JPanel();
    private static final JLabel GroupIndividualPenaltyPayTitle = new JLabel("member penalty pay");
    private static final JLabel GroupIndividualPenaltyPayIDLabel = new JLabel("enter your id");
    private static final JLabel GroupIndividualPenaltyPayAmountLabel = new JLabel("enter the amount");
    private static final JTextField GroupIndividualPenaltyPayIDEntry = new JTextField(10);
    private static final JTextField GroupIndividualPenaltyPayAmountEntry = new JTextField(10);
    private static final JButton GroupIndividualPenaltyPayResetButton = new JButton("reset");
    private static final JButton GroupIndividualPenaltyPaySubmitButton = new JButton("Submit");
    private static final JMenu NewPenaltyStatus = new JMenu("penalty status");
    private static final JMenuItem MemberPenaltyStatus = new JMenuItem("member");
    private static final JPanel MemberPenaltyStatusPanel = new JPanel();
    private static final JLabel MemberPenaltyStatusTitle = new JLabel("member penalty status");
    private static final JLabel MemberPenaltyStatusIDLabel = new JLabel("enter the id");
    private static final JLabel MemberPenaltyStatusFNameLabel = new JLabel("first name");
    private static final JLabel MemberPenaltyStatusLNameLabel = new JLabel("last name");
    private static final JLabel MemberPenaltyStatusPenaltyLabel = new JLabel("penalty");
    private static final JTextField MemberPenaltyStatusIDEntry = new JTextField(10);
    private static final JLabel MemberPenaltyStatusFNameEntry = new JLabel("");
    private static final JLabel MemberPenaltyStatusLNameEntry = new JLabel("");
    private static final JLabel MemberPenaltyStatusPenaltyEntry = new JLabel("");
    private static final JButton MemberPenaltyStatusSubmitButton = new JButton("Submit");
    private static final GridBagConstraints gridbag28 = new GridBagConstraints();
    private static final JMenuItem GroupPenaltyStatus = new JMenuItem("group");
    private static final JPanel GroupPenaltyStatusPanel = new JPanel();
    private static final JMenuItem GroupIndividualPenaltyStatus = new JMenuItem("individual");
    private static final JPanel GroupIndividualPenaltyStatusPanel = new JPanel();
    private static final JMenu NewDividends = new JMenu("dividends");
    private static final JMenuItem MemberDividends = new JMenuItem("member");
    private static final JPanel MemberDividendsPanel = new JPanel();

    public static void main(String[] args){
        new Main();
    }
    public Main(){
        // Registration
        NewRegistration.add(MemberRegistration);

        // user interface for member registration
        MemberRegistrationPanel.setBackground(new Color(255, 255, 0));
        MemberRegistrationPanel.setLayout(new GridBagLayout());
        MemberRegistrationResetButton.setEnabled(false);
        gridbag.gridx = 0; gridbag.gridy = 0;
        MemberRegistrationPanel.add(MemberRegistrationTitle, gridbag);
        gridbag.gridx = 0; gridbag.gridy = 1;
        MemberRegistrationPanel.add(MemberRegistrationIdLabel, gridbag);
        gridbag.gridx = 0; gridbag.gridy = 2;
        MemberRegistrationPanel.add(MemberRegistrationUNameLabel, gridbag);
        gridbag.gridx = 0; gridbag.gridy = 3;
        MemberRegistrationPanel.add(MemberRegistrationFNameLabel, gridbag);
        gridbag.gridx = 0; gridbag.gridy = 4;
        MemberRegistrationPanel.add(MemberRegistrationLNameLabel, gridbag);
        gridbag.gridx = 0; gridbag.gridy = 5;
        MemberRegistrationPanel.add(MemberRegistrationRFeesLabel, gridbag);
        gridbag.gridx = 0; gridbag.gridy = 6;
        MemberRegistrationPanel.add(MemberRegistrationAgeLabel, gridbag);
        gridbag.gridx = 0; gridbag.gridy = 7;
        MemberRegistrationPanel.add(MemberRegistrationMEmailLabel, gridbag);
        gridbag.gridx = 0; gridbag.gridy = 8;
        MemberRegistrationPanel.add(MemberRegistrationMPhoneLabel, gridbag);
        gridbag.gridx = 0; gridbag.gridy = 9;
        MemberRegistrationPanel.add(MemberRegistrationDayLabel, gridbag);
        gridbag.gridx = 1; gridbag.gridy = 9;
        MemberRegistrationPanel.add(MemberRegistrationMonthLabel, gridbag);
        gridbag.gridx = 2; gridbag.gridy = 9;
        MemberRegistrationPanel.add(MemberRegistrationYearLabel, gridbag);
        gridbag.gridx = 1; gridbag.gridy = 1;
        MemberRegistrationPanel.add(MemberRegistrationIdEntry, gridbag);
        gridbag.gridx = 1; gridbag.gridy = 2;
        MemberRegistrationPanel.add(MemberRegistrationUNameEntry, gridbag);
        gridbag.gridx = 1; gridbag.gridy = 3;
        MemberRegistrationPanel.add(MemberRegistrationFNameEntry, gridbag);
        gridbag.gridx = 1; gridbag.gridy = 4;
        MemberRegistrationPanel.add(MemberRegistrationLNameEntry, gridbag);
        gridbag.gridx = 1; gridbag.gridy = 5;
        MemberRegistrationPanel.add(MemberRegistrationRFeesEntry, gridbag);
        gridbag.gridx = 1; gridbag.gridy = 6;
        MemberRegistrationPanel.add(MemberRegistrationAgeEntry, gridbag);
        gridbag.gridx = 1; gridbag.gridy = 7;
        MemberRegistrationPanel.add(MemberRegistrationMEmailEntry, gridbag);
        gridbag.gridx = 1; gridbag.gridy = 8;
        MemberRegistrationPanel.add(MemberRegistrationMPhoneEntry, gridbag);
        gridbag.gridx = 0; gridbag.gridy = 10;
        MemberRegistrationPanel.add(MemberRegistrationDayEntry, gridbag);
        gridbag.gridx = 1; gridbag.gridy = 10;
        MemberRegistrationPanel.add(MemberRegistrationMonthEntry, gridbag);
        gridbag.gridx = 2; gridbag.gridy = 10;
        MemberRegistrationPanel.add(MemberRegistrationYearEntry, gridbag);
        gridbag.gridx = 0; gridbag.gridy = 11;
        MemberRegistrationPanel.add(MemberRegistrationSubmitButton, gridbag);
        gridbag.gridx = 1; gridbag.gridy = 11;
        MemberRegistrationPanel.add(MemberRegistrationResetButton, gridbag);

        NewRegistration.add(GroupRegistration);

        // user interface for group registration
        GroupRegistrationPanel.setBackground(new Color(255, 0,255));
        GroupRegistrationPanel.setLayout(new GridBagLayout());
        GroupRegistrationResetButton.setEnabled(false);
        GroupRegistrationSubmitButton.setEnabled(false);
        gridbag1.gridx = 0; gridbag1.gridy = 0;
        GroupRegistrationPanel.add(GroupRegistrationTitle, gridbag1);
        gridbag1.gridx = 0; gridbag1.gridy = 1;
        GroupRegistrationPanel.add(GroupRegistrationGIDLabel, gridbag1);
        gridbag1.gridx = 0; gridbag1.gridy = 2;
        GroupRegistrationPanel.add(GroupRegistrationGNameLabel, gridbag1);
        gridbag1.gridx = 0; gridbag1.gridy = 3;
        GroupRegistrationPanel.add(GroupRegistrationUNameLabel, gridbag1);
        gridbag1.gridx = 0; gridbag1.gridy = 4;
        GroupRegistrationPanel.add(GroupRegistrationFNameLabel, gridbag1);
        gridbag1.gridx = 0; gridbag1.gridy = 5;
        GroupRegistrationPanel.add(GroupRegistrationLNameLabel, gridbag1);
        gridbag1.gridx = 0; gridbag1.gridy = 6;
        GroupRegistrationPanel.add(GroupRegistrationRFeesLabel, gridbag1);
        gridbag1.gridx = 0; gridbag1.gridy = 7;
        GroupRegistrationPanel.add(GroupRegistrationMemberIdLabel, gridbag1);
        gridbag1.gridx = 0; gridbag1.gridy = 8;
        GroupRegistrationPanel.add(GroupRegistrationEmailLabel, gridbag1);
        gridbag1.gridx = 0; gridbag1.gridy = 9;
        GroupRegistrationPanel.add(GroupRegistrationPhoneLabel, gridbag1);
        gridbag1.gridx = 0; gridbag1.gridy = 10;
        GroupRegistrationPanel.add(GroupRegistrationDayLabel, gridbag1);
        gridbag1.gridx = 1; gridbag1.gridy = 10;
        GroupRegistrationPanel.add(GroupRegistrationMonthLabel, gridbag1);
        gridbag1.gridx = 2; gridbag1.gridy = 10;
        GroupRegistrationPanel.add(GroupRegistrationYearLabel, gridbag1);
        gridbag1.gridx = 1; gridbag1.gridy = 1;
        GroupRegistrationPanel.add(GroupRegistrationGIDEntry, gridbag1);
        gridbag1.gridx = 1; gridbag1.gridy = 2;
        GroupRegistrationPanel.add(GroupRegistrationGNameEntry, gridbag1);
        gridbag1.gridx = 1; gridbag1.gridy = 3;
        GroupRegistrationPanel.add(GroupRegistrationUNameEntry, gridbag1);
        gridbag1.gridx = 1; gridbag1.gridy = 4;
        GroupRegistrationPanel.add(GroupRegistrationFNameEntry, gridbag1);
        gridbag1.gridx = 1; gridbag1.gridy = 5;
        GroupRegistrationPanel.add(GroupRegistrationLNameEntry, gridbag1);
        gridbag1.gridx = 1; gridbag1.gridy = 6;
        GroupRegistrationPanel.add(GroupRegistrationRFeesEntry, gridbag1);
        gridbag1.gridx = 1; gridbag1.gridy = 7;
        GroupRegistrationPanel.add(GroupRegistrationMemberIdEntry, gridbag1);
        gridbag1.gridx = 1; gridbag1.gridy = 8;
        GroupRegistrationPanel.add(GroupRegistrationEmailEntry, gridbag1);
        gridbag1.gridx = 1; gridbag1.gridy = 9;
        GroupRegistrationPanel.add(GroupRegistrationPhoneEntry, gridbag1);
        gridbag1.gridx = 0; gridbag1.gridy = 11;
        GroupRegistrationPanel.add(GroupRegistrationDayEntry, gridbag1);
        gridbag1.gridx = 1; gridbag1.gridy = 11;
        GroupRegistrationPanel.add(GroupRegistrationMonthEntry, gridbag1);
        gridbag1.gridx = 2; gridbag1.gridy = 11;
        GroupRegistrationPanel.add(GroupRegistrationYearEntry, gridbag1);
        gridbag1.gridx = 0; gridbag1.gridy = 12;
        GroupRegistrationPanel.add(GroupRegistrationAddButton, gridbag1);
        gridbag1.gridx = 1; gridbag1.gridy = 12;
        GroupRegistrationPanel.add(GroupRegistrationSubmitButton, gridbag1);
        gridbag1.gridx = 2; gridbag1.gridy = 12;
        GroupRegistrationPanel.add(GroupRegistrationResetButton, gridbag1);

        // contribution
        NewContribution.add(Contribution);
        Contribution.add(MemberContribution);

        // member contribution
        MemberContributionPanel.setBackground(new Color(100, 255, 0));
        MemberContributionPanel.setLayout(new GridBagLayout());
        MemberContributionResetButton.setEnabled(false);
        gridbag4.gridx = 0; gridbag4.gridy = 0;
        MemberContributionPanel.add(MemberContributionTitle, gridbag4);
        gridbag4.gridx = 0; gridbag4.gridy = 1;
        MemberContributionPanel.add(MemberContributionIDLabel, gridbag4);
        gridbag4.gridx = 0; gridbag4.gridy = 2;
        MemberContributionPanel.add(MemberContributionContributionLabel, gridbag4);
        gridbag4.gridx = 0; gridbag4.gridy = 3;
        MemberContributionPanel.add(MemberContributionDayLabel, gridbag4);
        gridbag4.gridx = 1; gridbag4.gridy = 3;
        MemberContributionPanel.add(MemberContributionMonthLabel, gridbag4);
        gridbag4.gridx = 2; gridbag4.gridy = 3;
        MemberContributionPanel.add(MemberContributionYearLabel, gridbag4);
        gridbag4.gridx = 1; gridbag4.gridy = 1;
        MemberContributionPanel.add(MemberContributionIDEntry, gridbag4);
        gridbag4.gridx = 1; gridbag4.gridy = 2;
        MemberContributionPanel.add(MemberContributionContributionEntry, gridbag4);
        gridbag4.gridx = 0; gridbag4.gridy = 4;
        MemberContributionPanel.add(MemberContributionDayEntry, gridbag4);
        gridbag4.gridx = 1; gridbag4.gridy = 4;
        MemberContributionPanel.add(MemberContributionMonthEntry, gridbag4);
        gridbag4.gridx = 2; gridbag4.gridy = 4;
        MemberContributionPanel.add(MemberContributionYearEntry, gridbag4);
        gridbag4.gridx = 0; gridbag4.gridy = 6;
        MemberContributionPanel.add(MemberContributionSubmitButton, gridbag4);
        gridbag4.gridx = 1; gridbag4.gridy = 6;
        MemberContributionPanel.add(MemberContributionResetButton, gridbag4);

        Contribution.add(GroupContribution);

        // group contribution
        GroupContributionPanel.setBackground(new Color(255, 0, 100));
        GroupContributionPanel.setLayout(new GridBagLayout());
        GroupContributionResetButton.setEnabled(false);
        gridbag5.gridx = 0; gridbag5.gridy = 0;
        GroupContributionPanel.add(GroupContributionTitle, gridbag5);
        gridbag5.gridx = 0; gridbag5.gridy = 1;
        GroupContributionPanel.add(GroupContributionGroupIdLabel, gridbag5);
        gridbag5.gridx = 0; gridbag5.gridy = 2;
        GroupContributionPanel.add(GroupContributionMemberIdLabel, gridbag5);
        gridbag5.gridx = 0; gridbag5.gridy = 3;
        GroupContributionPanel.add(GroupContributionContributionLabel, gridbag5);
        gridbag5.gridx = 0; gridbag5.gridy = 4;
        GroupContributionPanel.add(GroupContributionDayLabel, gridbag5);
        gridbag5.gridx = 1; gridbag5.gridy = 4;
        GroupContributionPanel.add(GroupContributionMonthLabel, gridbag5);
        gridbag5.gridx = 2; gridbag5.gridy = 4;
        GroupContributionPanel.add(GroupContributionYearLabel, gridbag5);
        gridbag5.gridx = 1; gridbag5.gridy = 1;
        GroupContributionPanel.add(GroupContributionGroupIdEntry, gridbag5);
        gridbag5.gridx = 1; gridbag5.gridy = 2;
        GroupContributionPanel.add(GroupContributionMemberIdEntry, gridbag5);
        gridbag5.gridx = 1; gridbag5.gridy = 3;
        GroupContributionPanel.add(GroupContributionContributionEntry, gridbag5);
        gridbag5.gridx = 0; gridbag5.gridy = 5;
        GroupContributionPanel.add(GroupContributionDayEntry, gridbag5);
        gridbag5.gridx = 1; gridbag5.gridy = 5;
        GroupContributionPanel.add(GroupContributionMonthEntry, gridbag5);
        gridbag5.gridx = 2; gridbag5.gridy = 5;
        GroupContributionPanel.add(GroupContributionYearEntry, gridbag5);
        gridbag5.gridx = 0; gridbag5.gridy = 7;
        GroupContributionPanel.add(GroupContributionSubmitButton, gridbag5);
        gridbag5.gridx = 1; gridbag5.gridy = 7;
        GroupContributionPanel.add(GroupContributionResetButton, gridbag5);

        // contribution/ shares status
        NewContribution.add(NewContributionStatus);
        NewContributionStatus.add(MemberContributionStatus);

        // member contribution status
        MemberContributionStatusPanel.setBackground(new Color(150, 255, 100));
        MemberContributionStatusPanel.setLayout(new GridBagLayout());
        gridbag6.gridx = 0; gridbag6.gridy = 0;
        MemberContributionStatusPanel.add(MemberContributionStatusTitle, gridbag6);
        gridbag6.gridx = 0; gridbag6.gridy = 1;
        MemberContributionStatusPanel.add(MemberContributionStatusidLabel, gridbag6);
        gridbag6.gridx = 0; gridbag6.gridy = 2;
        MemberContributionStatusPanel.add(MemberContributionStatusUnameLabel, gridbag6);
        gridbag6.gridx = 0; gridbag6.gridy = 3;
        MemberContributionStatusPanel.add(MemberContributionStatusFNameLabel, gridbag6);
        gridbag6.gridx = 0; gridbag6.gridy = 4;
        MemberContributionStatusPanel.add(MemberContributionStatusLNameLabel, gridbag6);
        gridbag6.gridx = 0; gridbag6.gridy = 5;
        MemberContributionStatusPanel.add(MemberContributionStatusSharesLabel, gridbag6);
        gridbag6.gridx = 1; gridbag6.gridy = 1;
        MemberContributionStatusPanel.add(MemberContributionStatusIdEntry, gridbag6);
        gridbag6.gridx = 1; gridbag6.gridy = 2;
        MemberContributionStatusPanel.add(MemberContributionStatusResultUnameLabel, gridbag6);
        gridbag6.gridx = 1; gridbag6.gridy = 3;
        MemberContributionStatusPanel.add(MemberContributionStatusResultFNameLabel, gridbag6);
        gridbag6.gridx = 1; gridbag6.gridy = 4;
        MemberContributionStatusPanel.add(MemberContributionStatusResultLNameLabel, gridbag6);
        gridbag6.gridx = 1; gridbag6.gridy = 5;
        MemberContributionStatusPanel.add(MemberContributionStatusSharesResultLabel, gridbag6);
        gridbag6.gridx = 0; gridbag6.gridy = 6;
        MemberContributionStatusPanel.add(MemberContributionStatusSubmitButton, gridbag6);


        NewContributionStatus.add(GroupContributionStatus);

        GroupContributionStatusPanel.setBackground(new Color(255, 100, 150));
        GroupContributionStatusPanel.setLayout(new GridBagLayout());

        gridbag7.gridx = 0; gridbag7.gridy = 0;
        GroupContributionStatusPanel.add(GroupContributionStatusTitle, gridbag7);
        gridbag7.gridx = 0; gridbag7.gridy = 1;
        GroupContributionStatusPanel.add(GroupContributionStatusGIdLabel, gridbag7);
        gridbag7.gridx = 0; gridbag7.gridy = 2;
        GroupContributionStatusPanel.add(GroupContributionStatusGNameLabel, gridbag7);
        gridbag7.gridx = 0; gridbag7.gridy = 3;
        GroupContributionStatusPanel.add(GroupContributionStatusSharesLabel, gridbag7);
        gridbag7.gridx = 1; gridbag7.gridy = 1;
        GroupContributionStatusPanel.add(GroupContributionStatusGIdEntry, gridbag7);
        gridbag7.gridx = 1; gridbag7.gridy = 2;
        GroupContributionStatusPanel.add(GroupContributionStatusResultGNameLabel, gridbag7);
        gridbag7.gridx = 1; gridbag7.gridy = 3;
        GroupContributionStatusPanel.add(GroupContributionStatusResultSharesLabel, gridbag7);
        gridbag7.gridx = 0; gridbag7.gridy = 4;
        GroupContributionStatusPanel.add(GroupContributionStatusSubmitButton, gridbag7);


        NewContributionStatus.add(GroupContributionIndividualStatus);

        GroupContributionIndividualStatusPanel.setBackground(new Color(100, 150, 255));
        GroupContributionIndividualStatusPanel.setLayout(new GridBagLayout());
        gridbag20.gridx = 0; gridbag20.gridy = 0;
        GroupContributionIndividualStatusPanel.add(GroupContributionIndividualStatusTitle, gridbag20);
        gridbag20.gridx = 0; gridbag20.gridy = 1;
        GroupContributionIndividualStatusPanel.add(GroupContributionIndividualStatusIdLabel, gridbag20);
        gridbag20.gridx = 0; gridbag20.gridy = 2;
        GroupContributionIndividualStatusPanel.add(GroupContributionIndividualStatusUnameLabel, gridbag20);
        gridbag20.gridx = 0; gridbag20.gridy = 3;
        GroupContributionIndividualStatusPanel.add(GroupContributionIndividualStatusFnameLabel, gridbag20);
        gridbag20.gridx = 0; gridbag20.gridy = 4;
        GroupContributionIndividualStatusPanel.add(GroupContributionIndividualStatusLnameLabel, gridbag20);
        gridbag20.gridx = 0; gridbag20.gridy = 5;
        GroupContributionIndividualStatusPanel.add(GroupContributionIndividualStatusSharesLabel, gridbag20);
        gridbag20.gridx = 1; gridbag20.gridy = 1;
        GroupContributionIndividualStatusPanel.add(GroupContributionIndividualStatusIdEntry, gridbag20);
        gridbag20.gridx = 1; gridbag20.gridy = 2;
        GroupContributionIndividualStatusPanel.add(GroupContributionIndividualStatusResultUnameLabel, gridbag20);
        gridbag20.gridx = 1; gridbag20.gridy = 3;
        GroupContributionIndividualStatusPanel.add(GroupContributionIndividualStatusResultFnameLabel, gridbag20);
        gridbag20.gridx = 1; gridbag20.gridy = 4;
        GroupContributionIndividualStatusPanel.add(GroupContributionIndividualStatusResultLnameLabel, gridbag20);
        gridbag20.gridx = 1; gridbag20.gridy = 5;
        GroupContributionIndividualStatusPanel.add(GroupContributionIndividualStatusResultSharesLabel, gridbag20);
        gridbag20.gridx = 0; gridbag20.gridy = 6;
        GroupContributionIndividualStatusPanel.add(GroupContributionIndividualStatusSubmitButton, gridbag20);

        // loans
        NewLoans.add(NewLoansBorrowed);
        NewLoansBorrowed.add(MemberLoansBorrowed);

        MemberLoansBorrowedPanel.setBackground(new Color(200, 255, 100));
        MemberLoansBorrowedPanel.setLayout(new GridBagLayout());
        MemberLoansBorrowedResetButton.setEnabled(false);
        gridbag8.gridx = 0; gridbag8.gridy = 0;
        MemberLoansBorrowedPanel.add(MemberLoansBorrowedTitle, gridbag8);
        gridbag8.gridx = 0; gridbag8.gridy = 1;
        MemberLoansBorrowedPanel.add(MemberLoansBorrowedIdLabel, gridbag8);
        gridbag8.gridx = 0; gridbag8.gridy = 2;
        MemberLoansBorrowedPanel.add(MemberLoansBorrowedLoanaLabel, gridbag8);
        gridbag8.gridx = 0; gridbag8.gridy = 3;
        MemberLoansBorrowedPanel.add(MemberLoansBorrowedDayLabel, gridbag8);
        gridbag8.gridx = 1; gridbag8.gridy = 3;
        MemberLoansBorrowedPanel.add(MemberLoansBorrowedMonthLabel, gridbag8);
        gridbag8.gridx = 2; gridbag8.gridy = 3;
        MemberLoansBorrowedPanel.add(MemberLoansBorrowedYearLabel, gridbag8);
        gridbag8.gridx = 1; gridbag8.gridy = 1;
        MemberLoansBorrowedPanel.add(MemberLoansBorrowedIdEntry, gridbag8);
        gridbag8.gridx = 1; gridbag8.gridy = 2;
        MemberLoansBorrowedPanel.add(MemberLoansBorrowedLoansEntry, gridbag8);
        gridbag8.gridx = 0; gridbag8.gridy = 4;
        MemberLoansBorrowedPanel.add(MemberLoansBorrowedDayEntry, gridbag8);
        gridbag8.gridx = 1; gridbag8.gridy = 4;
        MemberLoansBorrowedPanel.add(MemberLoansBorrowedMonthEntry, gridbag8);
        gridbag8.gridx = 2; gridbag8.gridy = 4;
        MemberLoansBorrowedPanel.add(MemberLoansBorrowedYearEntry, gridbag8);
        gridbag8.gridx = 0; gridbag8.gridy = 6;
        MemberLoansBorrowedPanel.add(MemberLoansBorrowedSubmitButton, gridbag8);
        gridbag8.gridx = 1; gridbag8.gridy = 6;
        MemberLoansBorrowedPanel.add(MemberLoansBorrowedResetButton, gridbag8);

        NewLoansBorrowed.add(GroupLoansBorrowed);

        GroupLoansBorrowedPanel.setBackground(new Color(255, 200, 100));
        GroupLoansBorrowedPanel.setLayout(new GridBagLayout());
        GroupLoansBorrowedResetButton.setEnabled(false);
        gridbag9.gridx = 0; gridbag9.gridy = 0;
        GroupLoansBorrowedPanel.add(GroupLoansBorrowedTitle, gridbag9);
        gridbag9.gridx = 0; gridbag9.gridy = 1;
        GroupLoansBorrowedPanel.add(GroupLoansBorrowedIdLabel, gridbag9);
        gridbag9.gridx = 0; gridbag9.gridy = 2;
        GroupLoansBorrowedPanel.add(GroupLoansBorrowedLoanLabel, gridbag9);
        gridbag9.gridx = 0; gridbag9.gridy = 3;
        GroupLoansBorrowedPanel.add(GroupLoansBorrowedDayLabel, gridbag9);
        gridbag9.gridx = 1; gridbag9.gridy = 3;
        GroupLoansBorrowedPanel.add(GroupLoansBorrowedMonthLabel, gridbag9);
        gridbag9.gridx = 2; gridbag9.gridy = 3;
        GroupLoansBorrowedPanel.add(GroupLoansBorrowedYearLabel, gridbag9);
        gridbag9.gridx = 1; gridbag9.gridy = 1;
        GroupLoansBorrowedPanel.add(GroupLoansBorrowedIdEntry, gridbag9);
        gridbag9.gridx = 1; gridbag9.gridy = 2;
        GroupLoansBorrowedPanel.add(GroupLoansBorrowedLoansEntry, gridbag9);
        gridbag9.gridx = 0; gridbag9.gridy = 4;
        GroupLoansBorrowedPanel.add(GroupLoansBorrowedDayEntry, gridbag9);
        gridbag9.gridx = 1; gridbag9.gridy = 4;
        GroupLoansBorrowedPanel.add(GroupLoansBorrowedMonthEntry, gridbag9);
        gridbag9.gridx = 2; gridbag9.gridy = 4;
        GroupLoansBorrowedPanel.add(GroupLoansBorrowedYearEntry, gridbag9);
        gridbag9.gridx = 0; gridbag9.gridy = 6;
        GroupLoansBorrowedPanel.add(GroupLoansBorrowedSubmitButton, gridbag9);
        gridbag9.gridx = 1; gridbag9.gridy = 6;
        GroupLoansBorrowedPanel.add(GroupLoansBorrowedResetButton, gridbag9);

        NewLoansBorrowed.add(GroupIndividualLoansBorrowed);

        GroupIndividualLoansBorrowedPanel.setBackground(new Color(200, 100, 255));
        GroupIndividualLoansBorrowedPanel.setLayout(new GridBagLayout());
        GroupIndividualLoansBorrowedResetButton.setEnabled(false);
        gridbag14.gridx = 0; gridbag14.gridy = 0;
        GroupIndividualLoansBorrowedPanel.add(GroupIndividualLoansBorrowedTitle, gridbag14);
        gridbag14.gridx = 0; gridbag14.gridy = 1;
        GroupIndividualLoansBorrowedPanel.add(GroupIndividualLoansBorrowedIdLabel, gridbag14);
        gridbag14.gridx = 0; gridbag14.gridy = 2;
        GroupIndividualLoansBorrowedPanel.add(GroupIndividualLoansBorrowedLoanLabel, gridbag14);
        gridbag14.gridx = 0; gridbag14.gridy = 3;
        GroupIndividualLoansBorrowedPanel.add(GroupIndividualLoansBorrowedDayLabel, gridbag14);
        gridbag14.gridx = 1; gridbag14.gridy = 3;
        GroupIndividualLoansBorrowedPanel.add(GroupIndividualLoansBorrowedMonthLabel, gridbag14);
        gridbag14.gridx = 2; gridbag14.gridy = 3;
        GroupIndividualLoansBorrowedPanel.add(GroupIndividualLoansBorrowedYearLabel, gridbag14);
        gridbag14.gridx = 1; gridbag14.gridy = 1;
        GroupIndividualLoansBorrowedPanel.add(GroupIndividualLoansBorrowedIdEntry, gridbag14);
        gridbag14.gridx = 1; gridbag14.gridy = 2;
        GroupIndividualLoansBorrowedPanel.add(GroupIndividualLoansBorrowedLoanEntry, gridbag14);
        gridbag14.gridx = 0; gridbag14.gridy = 4;
        GroupIndividualLoansBorrowedPanel.add(GroupIndividualLoansBorrowedDayEntry, gridbag14);
        gridbag14.gridx = 1; gridbag14.gridy = 4;
        GroupIndividualLoansBorrowedPanel.add(GroupIndividualLoansBorrowedMonthEntry, gridbag14);
        gridbag14.gridx = 2; gridbag14.gridy = 4;
        GroupIndividualLoansBorrowedPanel.add(GroupIndividualLoansBorrowedYearEntry, gridbag14);
        gridbag14.gridx = 0; gridbag14.gridy = 6;
        GroupIndividualLoansBorrowedPanel.add(GroupIndividualLoansBorrowedSubmitButton, gridbag14);
        gridbag14.gridx = 1; gridbag14.gridy = 6;
        GroupIndividualLoansBorrowedPanel.add(GroupIndividualLoansBorrowedResetButton, gridbag14);

        NewLoans.add(NewLoansPay);
        NewLoansPay.add(MemberLoansPay);

        MemberLoansPayPanel.setBackground(new Color(200, 255, 150));
        MemberLoansPayPanel.setLayout(new GridBagLayout());
        MemberLoansPayResetButton.setEnabled(false);
        gridbag10.gridx = 0; gridbag10.gridy = 0;
        MemberLoansPayPanel.add(MemberLoansPayTitle, gridbag10);
        gridbag10.gridx = 0; gridbag10.gridy = 1;
        MemberLoansPayPanel.add(MemberLoansPayIdLabel, gridbag10);
        gridbag10.gridx = 0; gridbag10.gridy = 2;
        MemberLoansPayPanel.add(MemberLoansPayPayLabel, gridbag10);
        gridbag10.gridx = 0; gridbag10.gridy = 3;
        MemberLoansPayPanel.add(MemberLoansPayDayLabel, gridbag10);
        gridbag10.gridx = 1; gridbag10.gridy = 3;
        MemberLoansPayPanel.add(MemberLoansPayMonthLabel, gridbag10);
        gridbag10.gridx = 2; gridbag10.gridy = 3;
        MemberLoansPayPanel.add(MemberLoansPayYearLabel, gridbag10);
        gridbag10.gridx = 1; gridbag10.gridy = 1;
        MemberLoansPayPanel.add(MemberLoansPayIdEntry, gridbag10);
        gridbag10.gridx = 1; gridbag10.gridy = 2;
        MemberLoansPayPanel.add(MemberLoansPayPayEntry, gridbag10);
        gridbag10.gridx = 0; gridbag10.gridy = 4;
        MemberLoansPayPanel.add(MemberLoansPayDayEntry, gridbag10);
        gridbag10.gridx = 1; gridbag10.gridy = 4;
        MemberLoansPayPanel.add(MemberLoansPayMonthEntry, gridbag10);
        gridbag10.gridx = 2; gridbag10.gridy = 4;
        MemberLoansPayPanel.add(MemberLoansPayYearEntry, gridbag10);
        gridbag10.gridx = 0; gridbag10.gridy = 5;
        MemberLoansPayPanel.add(MemberLoansPaySubmitButton, gridbag10);
        gridbag10.gridx = 1; gridbag10.gridy = 5;
        MemberLoansPayPanel.add(MemberLoansPayResetButton, gridbag10);

        NewLoansPay.add(GroupLoansPay);

        GroupLoansPayPanel.setBackground(new Color(255, 200, 150));
        GroupLoansPayPanel.setLayout(new GridBagLayout());
        GroupLoansPayResetButton.setEnabled(false);
        gridbag11.gridx = 0; gridbag11.gridy = 0;
        GroupLoansPayPanel.add(GroupLoansPayTitle, gridbag11);
        gridbag11.gridx = 0; gridbag11.gridy = 1;
        GroupLoansPayPanel.add(GroupLoansPayIdLabel, gridbag11);
        gridbag11.gridx = 0; gridbag11.gridy = 2;
        GroupLoansPayPanel.add(GroupLoansPayPayLabel, gridbag11);
        gridbag11.gridx = 0; gridbag11.gridy = 3;
        GroupLoansPayPanel.add(GroupLoansPayDayLabel, gridbag11);
        gridbag11.gridx = 1; gridbag11.gridy = 3;
        GroupLoansPayPanel.add(GroupLoansPayMonthLabel, gridbag11);
        gridbag11.gridx = 2; gridbag11.gridy = 3;
        GroupLoansPayPanel.add(GroupLoansPayYearLabel, gridbag11);
        gridbag11.gridx = 1; gridbag11.gridy = 1;
        GroupLoansPayPanel.add(GroupLoansPayIdEntry, gridbag11);
        gridbag11.gridx = 1; gridbag11.gridy = 2;
        GroupLoansPayPanel.add(GroupLoansPayPayEntry, gridbag11);
        gridbag11.gridx = 0; gridbag11.gridy = 4;
        GroupLoansPayPanel.add(GroupLoansPayDayEntry, gridbag11);
        gridbag11.gridx = 1; gridbag11.gridy = 4;
        GroupLoansPayPanel.add(GroupLoansPayMonthEntry, gridbag11);
        gridbag11.gridx = 2; gridbag11.gridy = 4;
        GroupLoansPayPanel.add(GroupLoansPayYearEntry, gridbag11);
        gridbag11.gridx = 0; gridbag11.gridy = 5;
        GroupLoansPayPanel.add(GroupLoansPaySubmitButton, gridbag11);
        gridbag11.gridx = 1; gridbag11.gridy = 5;
        GroupLoansPayPanel.add(GroupLoansPayResetButton, gridbag11);

        NewLoansPay.add(GroupIndividualLoansPay);

        GroupIndividualLoansPayPanel.setBackground(new Color(200, 150, 255));
        GroupIndividualLoansPayPanel.setLayout(new GridBagLayout());
        GroupIndividualLoansPayResetButton.setEnabled(false);
        gridbag19.gridx = 0; gridbag19.gridy = 0;
        GroupIndividualLoansPayPanel.add(GroupIndividualLoansPayTitle, gridbag19);
        gridbag19.gridx = 0; gridbag19.gridy = 1;
        GroupIndividualLoansPayPanel.add(GroupIndividualLoansPayIdLabel, gridbag19);
        gridbag19.gridx = 0; gridbag19.gridy = 2;
        GroupIndividualLoansPayPanel.add(GroupIndividualLoansPayPayLabel, gridbag19);
        gridbag19.gridx = 0; gridbag19.gridy = 3;
        GroupIndividualLoansPayPanel.add(GroupIndividualLoansPayDayLabel, gridbag19);
        gridbag19.gridx = 1; gridbag19.gridy = 3;
        GroupIndividualLoansPayPanel.add(GroupIndividualLoansPayMonthLabel, gridbag19);
        gridbag19.gridx = 2; gridbag19.gridy = 3;
        GroupIndividualLoansPayPanel.add(GroupIndividualLoansPayYearLabel, gridbag19);
        gridbag19.gridx = 1; gridbag19.gridy = 1;
        GroupIndividualLoansPayPanel.add(GroupIndividualLoansPayIdEntry, gridbag19);
        gridbag19.gridx = 1; gridbag19.gridy = 2;
        GroupIndividualLoansPayPanel.add(GroupIndividualLoansPayPayEntry, gridbag19);
        gridbag19.gridx = 0; gridbag19.gridy = 4;
        GroupIndividualLoansPayPanel.add(GroupIndividualLoansPayDayEntry, gridbag19);
        gridbag19.gridx = 1; gridbag19.gridy = 4;
        GroupIndividualLoansPayPanel.add(GroupIndividualLoansPayMonthEntry, gridbag19);
        gridbag19.gridx = 2; gridbag19.gridy = 4;
        GroupIndividualLoansPayPanel.add(GroupIndividualLoansPayYearEntry, gridbag19);
        gridbag19.gridx = 0; gridbag19.gridy = 5;
        GroupIndividualLoansPayPanel.add(GroupIndividualLoansPaySubmitButton, gridbag19);
        gridbag19.gridx = 1; gridbag19.gridy = 5;
        GroupIndividualLoansPayPanel.add(GroupIndividualLoansPayResetButton, gridbag19);

        NewLoans.add(NewLoansStatus);
        NewLoansStatus.add(MemberLoansStatus);

        MemberLoansStatusPanel.setBackground(new Color(50, 255, 200));
        MemberLoansStatusPanel.setLayout(new GridBagLayout());
        gridbag12.gridx = 0; gridbag12.gridy = 0;
        MemberLoansStatusPanel.add(MemberLoansStatusTitle, gridbag12);
        gridbag12.gridx = 0; gridbag12.gridy = 1;
        MemberLoansStatusPanel.add(MemberLoansStatusIDLabel, gridbag12);
        gridbag12.gridx = 0; gridbag12.gridy = 2;
        MemberLoansStatusPanel.add(MemberLoansStatusFNameLabel, gridbag12);
        gridbag12.gridx = 0; gridbag12.gridy = 3;
        MemberLoansStatusPanel.add(MemberLoansStatusLNameLabel, gridbag12);
        gridbag12.gridx = 0; gridbag12.gridy = 4;
        MemberLoansStatusPanel.add(MemberLoansStatusRepayLabel, gridbag12);
        gridbag12.gridx = 0; gridbag12.gridy = 5;
        MemberLoansStatusPanel.add(MemberLoansStatusLoanLabel, gridbag12);
        gridbag12.gridx = 0; gridbag12.gridy = 6;
        MemberLoansStatusPanel.add(MemberLoansStatusInterestLabel, gridbag12);
        gridbag12.gridx = 1; gridbag12.gridy = 1;
        MemberLoansStatusPanel.add(MemberLoansStatusIDEntry, gridbag12);
        gridbag12.gridx = 1; gridbag12.gridy = 2;
        MemberLoansStatusPanel.add(MemberLoansStatusFNameEntry, gridbag12);
        gridbag12.gridx = 1; gridbag12.gridy = 3;
        MemberLoansStatusPanel.add(MemberLoansStatusLNameEntry, gridbag12);
        gridbag12.gridx = 1; gridbag12.gridy = 4;
        MemberLoansStatusPanel.add(MemberLoansStatusRepayEntry, gridbag12);
        gridbag12.gridx = 1; gridbag12.gridy = 5;
        MemberLoansStatusPanel.add(MemberLoansStatusLoanEntry, gridbag12);
        gridbag12.gridx = 1; gridbag12.gridy = 6;
        MemberLoansStatusPanel.add(MemberLoansStatusInterestEntry, gridbag12);
        gridbag12.gridx = 0; gridbag12.gridy = 7;
        MemberLoansStatusPanel.add(MemberLoansStatusSubmitButton, gridbag12);

        NewLoansStatus.add(GroupLoansStatus);

        GroupLoansStatusPanel.setBackground(new Color(255, 50, 200));
        GroupLoansStatusPanel.setLayout(new GridBagLayout());
        gridbag13.gridx = 0; gridbag13.gridy = 0;
        GroupLoansStatusPanel.add(GroupLoansStatusTitle, gridbag13);
        gridbag13.gridx = 0; gridbag13.gridy = 1;
        GroupLoansStatusPanel.add(GroupLoansStatusIDLabel, gridbag13);
        gridbag13.gridx = 0; gridbag13.gridy = 2;
        GroupLoansStatusPanel.add(GroupLoansStatusNameLabel, gridbag13);
        gridbag13.gridx = 0; gridbag13.gridy = 3;
        GroupLoansStatusPanel.add(GroupLoansStatusRepayLabel, gridbag13);
        gridbag13.gridx = 0; gridbag13.gridy = 4;
        GroupLoansStatusPanel.add(GroupLoansStatusLoanLabel, gridbag13);
        gridbag13.gridx = 0; gridbag13.gridy = 5;
        GroupLoansStatusPanel.add(GroupLoansStatusInterestLabel, gridbag13);
        gridbag13.gridx = 1; gridbag13.gridy = 1;
        GroupLoansStatusPanel.add(GroupLoansStatusIDEntry, gridbag13);
        gridbag13.gridx = 1; gridbag13.gridy = 2;
        GroupLoansStatusPanel.add(GroupLoansStatusNameEntry, gridbag13);
        gridbag13.gridx = 1; gridbag13.gridy = 3;
        GroupLoansStatusPanel.add(GroupLoansStatusRepayEntry, gridbag13);
        gridbag13.gridx = 1; gridbag13.gridy = 4;
        GroupLoansStatusPanel.add(GroupLoansStatusLoanEntry, gridbag13);
        gridbag13.gridx = 1; gridbag13.gridy = 5;
        GroupLoansStatusPanel.add(GroupLoansStatusInterestEntry, gridbag13);
        gridbag13.gridx = 0; gridbag13.gridy = 6;
        GroupLoansStatusPanel.add(GroupLoansStatusSubmitButton, gridbag13);

        NewLoansStatus.add(GroupIndividualLoansStatus);

        GroupIndividualLoansStatusPanel.setBackground(new Color(50, 200, 255));
        GroupIndividualLoansStatusPanel.setLayout(new GridBagLayout());
        gridbag25.gridx = 0; gridbag25.gridy = 0;
        GroupIndividualLoansStatusPanel.add(GroupIndividualLoansStatusTitle, gridbag25);
        gridbag25.gridx = 0; gridbag25.gridy = 1;
        GroupIndividualLoansStatusPanel.add(GroupIndividualLoansStatusIDLabel, gridbag25);
        gridbag25.gridx = 0; gridbag25.gridy = 2;
        GroupIndividualLoansStatusPanel.add(GroupIndividualLoansStatusFNameLabel, gridbag25);
        gridbag25.gridx = 0; gridbag25.gridy = 3;
        GroupIndividualLoansStatusPanel.add(GroupIndividualLoansStatusLNameLabel, gridbag25);
        gridbag25.gridx = 0; gridbag25.gridy = 4;
        GroupIndividualLoansStatusPanel.add(GroupIndividualLoansStatusRepayLabel, gridbag25);
        gridbag25.gridx = 0; gridbag25.gridy = 5;
        GroupIndividualLoansStatusPanel.add(GroupIndividualLoansStatusLoanLabel, gridbag25);
        gridbag25.gridx = 0; gridbag25.gridy = 6;
        GroupIndividualLoansStatusPanel.add(GroupIndividualLoansStatusInterestLabel, gridbag25);
        gridbag25.gridx = 1; gridbag25.gridy = 1;
        GroupIndividualLoansStatusPanel.add(GroupIndividualLoansStatusIDEntry, gridbag25);
        gridbag25.gridx = 1; gridbag25.gridy = 2;
        GroupIndividualLoansStatusPanel.add(GroupIndividualLoansStatusFNameEntry, gridbag25);
        gridbag25.gridx = 1; gridbag25.gridy = 3;
        GroupIndividualLoansStatusPanel.add(GroupIndividualLoansStatusLNameEntry, gridbag25);
        gridbag25.gridx = 1; gridbag25.gridy = 4;
        GroupIndividualLoansStatusPanel.add(GroupIndividualLoansStatusRepayEntry, gridbag25);
        gridbag25.gridx = 1; gridbag25.gridy = 5;
        GroupIndividualLoansStatusPanel.add(GroupIndividualLoansStatusLoanEntry, gridbag25);
        gridbag25.gridx = 1; gridbag25.gridy = 6;
        GroupIndividualLoansStatusPanel.add(GroupIndividualLoansStatusInterestEntry, gridbag25);
        gridbag25.gridx = 0; gridbag25.gridy = 7;
        GroupIndividualLoansStatusPanel.add(GroupIndividualLoansStatusSubmitButton, gridbag25);

        NewReports.add(NewPenaltyPay);
        NewPenaltyPay.add(MemberPenaltyPay);

        MemberPenaltyPayPanel.setBackground(new Color(150, 255, 150));
        MemberPenaltyPayPanel.setLayout(new GridBagLayout());
        MemberPenaltyPayPanelResetButton.setEnabled(false);
        gridbag26.gridx = 0; gridbag26.gridy = 0;
        MemberPenaltyPayPanel.add(MemberPenaltyPayPanelTitle, gridbag26);
        gridbag26.gridx = 0; gridbag26.gridy = 1;
        MemberPenaltyPayPanel.add(MemberPenaltyPayPanelIDLabel, gridbag26);
        gridbag26.gridx = 0; gridbag26.gridy = 2;
        MemberPenaltyPayPanel.add(MemberPenaltyPayPanelAmountLabel, gridbag26);
        gridbag26.gridx = 1; gridbag26.gridy = 1;
        MemberPenaltyPayPanel.add(MemberPenaltyPayPanelIDEntry, gridbag26);
        gridbag26.gridx = 1; gridbag26.gridy = 2;
        MemberPenaltyPayPanel.add( MemberPenaltyPayPanelAmountEntry, gridbag26);
        gridbag26.gridx = 0; gridbag26.gridy = 3;
        MemberPenaltyPayPanel.add(MemberPenaltyPayPanelSubmitButton, gridbag26);
        gridbag26.gridx = 1; gridbag26.gridy = 3;
        MemberPenaltyPayPanel.add(MemberPenaltyPayPanelResetButton, gridbag26);

        NewPenaltyPay.add(GroupPenaltyPay);

        GroupPenaltyPayPanel.setBackground(new Color(255, 150, 150));
        GroupPenaltyPayPanel.setLayout(new GridBagLayout());
        GroupPenaltyPayResetButton.setEnabled(false);
        gridbag27.gridx = 0; gridbag27.gridy = 0;
        GroupPenaltyPayPanel.add(GroupPenaltyPayTitle, gridbag27);
        gridbag27.gridx = 0; gridbag27.gridy = 1;
        GroupPenaltyPayPanel.add(GroupPenaltyPayIDLabel, gridbag27);
        gridbag27.gridx = 0; gridbag27.gridy = 2;
        GroupPenaltyPayPanel.add(GroupPenaltyPayAmountLabel, gridbag27);
        gridbag27.gridx = 1; gridbag27.gridy = 1;
        GroupPenaltyPayPanel.add(GroupPenaltyPayIDEntry, gridbag27);
        gridbag27.gridx = 1; gridbag27.gridy = 2;
        GroupPenaltyPayPanel.add( GroupPenaltyPayAmountEntry, gridbag27);
        gridbag27.gridx = 0; gridbag27.gridy = 3;
        GroupPenaltyPayPanel.add(GroupPenaltyPaySubmitButton, gridbag27);
        gridbag27.gridx = 1; gridbag27.gridy = 3;
        GroupPenaltyPayPanel.add(GroupPenaltyPayResetButton, gridbag27);

        NewPenaltyPay.add(GroupIndividualPenaltyPay);

        GroupIndividualPenaltyPayPanel.setBackground(new Color(150, 150, 255));
        GroupIndividualPenaltyPayPanel.setLayout(new GridBagLayout());
        GroupIndividualPenaltyPayResetButton.setEnabled(false);

        gridbag28.gridx = 0; gridbag28.gridy = 0;
        GroupIndividualPenaltyPayPanel.add(GroupIndividualPenaltyPayTitle, gridbag28);
        gridbag28.gridx = 0; gridbag28.gridy = 1;
        GroupIndividualPenaltyPayPanel.add(GroupIndividualPenaltyPayIDLabel, gridbag28);
        gridbag28.gridx = 0; gridbag28.gridy = 2;
        GroupIndividualPenaltyPayPanel.add(GroupIndividualPenaltyPayAmountLabel, gridbag28);
        gridbag28.gridx = 1; gridbag28.gridy = 1;
        GroupIndividualPenaltyPayPanel.add(GroupIndividualPenaltyPayIDEntry, gridbag28);
        gridbag28.gridx = 1; gridbag28.gridy = 2;
        GroupIndividualPenaltyPayPanel.add( GroupIndividualPenaltyPayAmountEntry, gridbag28);
        gridbag28.gridx = 0; gridbag28.gridy = 3;
        GroupIndividualPenaltyPayPanel.add(GroupIndividualPenaltyPaySubmitButton, gridbag28);
        gridbag28.gridx = 1; gridbag28.gridy = 3;
        GroupIndividualPenaltyPayPanel.add(GroupIndividualPenaltyPayResetButton, gridbag28);

        NewReports.add(NewPenaltyStatus);
        NewPenaltyStatus.add(MemberPenaltyStatus);

        MemberPenaltyStatusPanel.setBackground(new Color(200, 255, 255));
        MemberPenaltyStatusPanel.setLayout(new GridBagLayout());
        GridBagConstraints gridbag29 = new GridBagConstraints();
        gridbag29.gridx = 0; gridbag29.gridy = 0;
        MemberPenaltyStatusPanel.add(MemberPenaltyStatusTitle, gridbag29);
        gridbag29.gridx = 0; gridbag29.gridy = 1;
        MemberPenaltyStatusPanel.add(MemberPenaltyStatusIDLabel, gridbag29);
        gridbag29.gridx = 0; gridbag29.gridy = 2;
        MemberPenaltyStatusPanel.add(MemberPenaltyStatusFNameLabel, gridbag29);
        gridbag29.gridx = 0; gridbag29.gridy = 3;
        MemberPenaltyStatusPanel.add(MemberPenaltyStatusLNameLabel, gridbag29);
        gridbag29.gridx = 0; gridbag29.gridy = 4;
        MemberPenaltyStatusPanel.add(MemberPenaltyStatusPenaltyLabel, gridbag29);
        gridbag29.gridx = 1; gridbag29.gridy = 1;
        MemberPenaltyStatusPanel.add(MemberPenaltyStatusIDEntry, gridbag29);
        gridbag29.gridx = 1; gridbag29.gridy = 2;
        MemberPenaltyStatusPanel.add(MemberPenaltyStatusFNameEntry, gridbag29);
        gridbag29.gridx = 1; gridbag29.gridy = 3;
        MemberPenaltyStatusPanel.add(MemberPenaltyStatusLNameEntry, gridbag29);
        gridbag29.gridx = 1; gridbag29.gridy = 4;
        MemberPenaltyStatusPanel.add(MemberPenaltyStatusPenaltyEntry, gridbag29);
        gridbag29.gridx = 0; gridbag29.gridy = 5;
        MemberPenaltyStatusPanel.add(MemberPenaltyStatusSubmitButton, gridbag29);

        NewPenaltyStatus.add(GroupPenaltyStatus);
        
        GroupPenaltyStatusPanel.setBackground(new Color(255, 200, 200));
        GroupPenaltyStatusPanel.setLayout(new GridBagLayout());
        gridbag21.gridx = 0; gridbag21.gridy = 0;
        GroupPenaltyStatusPanel.add(GroupPenaltyStatusTitle, gridbag21);
        gridbag21.gridx = 0; gridbag21.gridy = 1;
        GroupPenaltyStatusPanel.add(GroupPenaltyStatusIDLabel, gridbag21);
        gridbag21.gridx = 0; gridbag21.gridy = 2;
        GroupPenaltyStatusPanel.add(GroupPenaltyStatusNameLabel, gridbag21);
        gridbag21.gridx = 0; gridbag21.gridy = 3;
        GroupPenaltyStatusPanel.add(GroupPenaltyStatusPenaltyLabel, gridbag21);
        gridbag21.gridx = 1; gridbag21.gridy = 1;
        GroupPenaltyStatusPanel.add(GroupPenaltyStatusIDEntry, gridbag21);
        gridbag21.gridx = 1; gridbag21.gridy = 2;
        GroupPenaltyStatusPanel.add(GroupPenaltyStatusNameEntry, gridbag21);
        gridbag21.gridx = 1; gridbag21.gridy = 3;
        GroupPenaltyStatusPanel.add(GroupPenaltyStatusPenaltyEntry, gridbag21);
        gridbag21.gridx = 0; gridbag21.gridy = 4;
        GroupPenaltyStatusPanel.add(GroupPenaltyStatusSubmitButton, gridbag21);

        NewPenaltyStatus.add(GroupIndividualPenaltyStatus);
        
        GroupIndividualPenaltyStatusPanel.setBackground(new Color(200, 200, 255));
        GroupIndividualPenaltyStatusPanel.setLayout(new GridBagLayout());
        gridbag22.gridx = 0; gridbag22.gridy = 0;
        GroupIndividualPenaltyStatusPanel.add(GroupIndividualPenaltyStatusTitle, gridbag22);
        gridbag22.gridx = 0; gridbag22.gridy = 1;
        GroupIndividualPenaltyStatusPanel.add(GroupIndividualPenaltyStatusIDLabel, gridbag22);
        gridbag22.gridx = 0; gridbag22.gridy = 2;
        GroupIndividualPenaltyStatusPanel.add(GroupIndividualPenaltyStatusFNameLabel, gridbag22);
        gridbag22.gridx = 0; gridbag22.gridy = 3;
        GroupIndividualPenaltyStatusPanel.add(GroupIndividualPenaltyStatusLNameLabel, gridbag22);
        gridbag22.gridx = 0; gridbag22.gridy = 4;
        GroupIndividualPenaltyStatusPanel.add(GroupIndividualPenaltyStatusPenaltyLabel, gridbag22);
        gridbag22.gridx = 1; gridbag22.gridy = 1;
        GroupIndividualPenaltyStatusPanel.add(GroupIndividualPenaltyStatusIDEntry, gridbag22);
        gridbag22.gridx = 1; gridbag22.gridy = 2;
        GroupIndividualPenaltyStatusPanel.add(GroupIndividualPenaltyStatusFNameEntry, gridbag22);
        gridbag22.gridx = 1; gridbag22.gridy = 3;
        GroupIndividualPenaltyStatusPanel.add(GroupIndividualPenaltyStatusLNameEntry, gridbag22);
        gridbag22.gridx = 1; gridbag22.gridy = 4;
        GroupIndividualPenaltyStatusPanel.add(GroupIndividualPenaltyStatusPenaltyEntry, gridbag22);
        gridbag22.gridx = 0; gridbag22.gridy = 5;
        GroupIndividualPenaltyStatusPanel.add(GroupIndividualPenaltyStatusSubmitButton, gridbag22);

        NewReports.add(NewDividends);
        NewDividends.add(MemberDividends);
        
        MemberDividendsPanel.setBackground(new Color(100, 255, 100));
        MemberDividendsPanel.setLayout(new GridBagLayout());
        gridbag23.gridx = 0; gridbag23.gridy = 0;
        MemberDividendsPanel.add(MemberDividendsTitle, gridbag23);
        gridbag23.gridx = 0; gridbag23.gridy = 1;
        MemberDividendsPanel.add(MemberDividendsIDLabel, gridbag23);
        gridbag23.gridx = 0; gridbag23.gridy = 2;
        MemberDividendsPanel.add(MemberDividendsFNameLabel, gridbag23);
        gridbag23.gridx = 0; gridbag23.gridy = 3;
        MemberDividendsPanel.add(MemberDividendsLNameLabel, gridbag23);
        gridbag23.gridx = 0; gridbag23.gridy = 4;
        MemberDividendsPanel.add(MemberDividendsDividendsLabel, gridbag23);
        gridbag23.gridx = 1; gridbag23.gridy = 1;
        MemberDividendsPanel.add(MemberDividendsIDEntry, gridbag23);
        gridbag23.gridx = 1; gridbag23.gridy = 2;
        MemberDividendsPanel.add(MemberDividendsFNameEntry, gridbag23);
        gridbag23.gridx = 1; gridbag23.gridy = 3;
        MemberDividendsPanel.add(MemberDividendsLNameEntry, gridbag23);
        gridbag23.gridx = 1; gridbag23.gridy = 4;
        MemberDividendsPanel.add(MemberDividendsDividendsEntry, gridbag23);
        gridbag23.gridx = 0; gridbag23.gridy = 5;
        MemberDividendsPanel.add(MemberDividendsSubmitButton, gridbag23);

        JMenuItem GroupDividends = new JMenuItem("group");
        NewDividends.add(GroupDividends);
        JPanel GroupDividendsPanel = new JPanel();
        GroupDividendsPanel.setBackground(new Color(255, 100, 100));
        GroupDividendsPanel.setLayout(new GridBagLayout());
        gridbag24.gridx = 0; gridbag24.gridy = 0;
        GroupDividendsPanel.add(GroupDividendsTitle, gridbag24);
        gridbag24.gridx = 0; gridbag24.gridy = 1;
        GroupDividendsPanel.add(GroupDividendsIDLabel, gridbag24);
        gridbag24.gridx = 0; gridbag24.gridy = 2;
        GroupDividendsPanel.add(GroupDividendsNameLabel, gridbag24);
        gridbag24.gridx = 0; gridbag24.gridy = 3;
        GroupDividendsPanel.add(GroupDividendsDividendsLabel, gridbag24);
        gridbag24.gridx = 1; gridbag24.gridy = 1;
        GroupDividendsPanel.add(GroupDividendsIDEntry, gridbag24);
        gridbag24.gridx = 1; gridbag24.gridy = 2;
        GroupDividendsPanel.add(GroupDividendsNameEntry, gridbag24);
        gridbag24.gridx = 1; gridbag24.gridy = 3;
        GroupDividendsPanel.add(GroupDividendsDividendsEntry, gridbag24);
        gridbag24.gridx = 0; gridbag24.gridy = 4;
        GroupDividendsPanel.add(GroupDividendsSubmitButton, gridbag24);

        JMenuItem GroupIndividualDividends = new JMenuItem("individual");
        NewDividends.add(GroupIndividualDividends);
        JPanel GroupIndividualDividendsPanel = new JPanel();
        GroupIndividualDividendsPanel.setBackground(new Color(100, 100, 255));
        GroupIndividualDividendsPanel.setLayout(new GridBagLayout());
        gridbag30.gridx = 0; gridbag30.gridy = 0;
        GroupIndividualDividendsPanel.add(GroupIndividualDividendsTitle, gridbag30);
        gridbag30.gridx = 0; gridbag30.gridy = 1;
        GroupIndividualDividendsPanel.add(GroupIndividualDividendsIDLabel, gridbag30);
        gridbag30.gridx = 0; gridbag30.gridy = 2;
        GroupIndividualDividendsPanel.add(GroupIndividualDividendsFNameLabel, gridbag30);
        gridbag30.gridx = 0; gridbag30.gridy = 3;
        GroupIndividualDividendsPanel.add(GroupIndividualDividendsLNameLabel, gridbag30);
        gridbag30.gridx = 0; gridbag30.gridy = 4;
        GroupIndividualDividendsPanel.add(GroupIndividualDividendsDividendsLabel, gridbag30);
        gridbag30.gridx = 1; gridbag30.gridy = 1;
        GroupIndividualDividendsPanel.add(GroupIndividualDividendsIDEntry, gridbag30);
        gridbag30.gridx = 1; gridbag30.gridy = 2;
        GroupIndividualDividendsPanel.add(GroupIndividualDividendsFNameEntry, gridbag30);
        gridbag30.gridx = 1; gridbag30.gridy = 3;
        GroupIndividualDividendsPanel.add(GroupIndividualDividendsLNameEntry, gridbag30);
        gridbag30.gridx = 1; gridbag30.gridy = 4;
        GroupIndividualDividendsPanel.add(GroupIndividualDividendsDividendsEntry, gridbag30);
        gridbag30.gridx = 0; gridbag30.gridy = 5;
        GroupIndividualDividendsPanel.add(GroupIndividualDividendsSubmitButton, gridbag30);

        firstPage.setLayout(new BorderLayout());
        firstPage.add(titleLabel);
        contentpage.setLayout(new BoxLayout(contentpage,BoxLayout.Y_AXIS));
        registrationbutton.setBorder(BorderFactory.createEmptyBorder());
        contributionbutton.setBorder(BorderFactory.createEmptyBorder());
        loanbutton.setBorder(BorderFactory.createEmptyBorder());
        reportbutton.setBorder(BorderFactory.createEmptyBorder());

        contributionpage.setLayout(new BoxLayout(contributionpage,BoxLayout.Y_AXIS));
        loanpage.setLayout(new BoxLayout(loanpage,BoxLayout.Y_AXIS));
        reportPage.setLayout(new BoxLayout(reportPage,BoxLayout.Y_AXIS));
        registrationpage.setLayout(new BoxLayout(registrationpage,BoxLayout.Y_AXIS));

        contributionpage.setBackground(new Color(120, 80, 25));
        loanpage.setBackground(new Color(140, 200, 140));
        reportPage.setBackground(new Color(160, 255, 70));
        registrationpage.setBackground(new Color(180, 100, 55));

        contentpage.add(registrationbutton);
        contentpage.add(contributionbutton);
        contentpage.add(loanbutton);
        contentpage.add(reportbutton);
        registrationpage.add(memberreg);
        registrationpage.add(groupreg);
        contributionpage.add(membercontrib);
        contributionpage.add(groupcontrib);
        contributionpage.add(membercontribstatus);
        contributionpage.add(groupcontribstatus);
        contributionpage.add(groupindividualcontribstatus);
        loanpage.add(memberborrow);
        loanpage.add(groupborrow);
        loanpage.add(groupindividualborrow);
        loanpage.add(memberpay);
        loanpage.add(grouppay);
        loanpage.add(groupindividualpay);
        loanpage.add(memberpaystatus);
        loanpage.add(grouppaystatus);
        loanpage.add(groupindividualpaystatus);
        reportPage.add(memberpenalty);
        reportPage.add(grouppaypenalty);
        reportPage.add(groupindividualpenalty);
        reportPage.add(memberpenaltystatus);
        reportPage.add(grouppenaltystatus);
        reportPage.add(groupindividualpenaltystatus);
        reportPage.add(memberincomestatus);
        reportPage.add(groupincomestatus);
        reportPage.add(groupindividualincomestatus);

        mainPanel.setLayout(card);
        mainPanel.add(firstPage);
        mainPanel.add(MemberRegistrationPanel, "1");
        mainPanel.add(GroupRegistrationPanel, "2");
        mainPanel.add(MemberContributionPanel, "3");
        mainPanel.add(GroupContributionPanel, "4");
        mainPanel.add(MemberContributionStatusPanel, "5");
        mainPanel.add(GroupContributionStatusPanel, "6");
        mainPanel.add(MemberLoansBorrowedPanel, "7");
        mainPanel.add(GroupLoansBorrowedPanel, "8");
        mainPanel.add(MemberLoansPayPanel, "9");
        mainPanel.add(GroupLoansPayPanel, "10");
        mainPanel.add(MemberLoansStatusPanel, "11");
        mainPanel.add(GroupLoansStatusPanel, "12");
        mainPanel.add(GroupIndividualLoansBorrowedPanel, "13");
        mainPanel.add(GroupContributionIndividualStatusPanel, "14");
        mainPanel.add(registrationpage, "15");
        mainPanel.add(contributionpage, "16");
        mainPanel.add(loanpage, "17");
        mainPanel.add(GroupIndividualLoansPayPanel, "18");
        mainPanel.add(MemberPenaltyPayPanel, "19");
        mainPanel.add(MemberLoansStatusPanel, "20");
        mainPanel.add(GroupLoansStatusPanel, "21");
        mainPanel.add(GroupIndividualLoansStatusPanel, "22");
        mainPanel.add(GroupPenaltyPayPanel, "23");
        mainPanel.add(GroupIndividualPenaltyPayPanel, "24");
        mainPanel.add(MemberPenaltyStatusPanel, "25");
        mainPanel.add(GroupPenaltyStatusPanel, "26");
        mainPanel.add(GroupIndividualPenaltyStatusPanel, "27");
        mainPanel.add(MemberDividendsPanel, "28");
        mainPanel.add(GroupDividendsPanel, "29");
        mainPanel.add(GroupIndividualDividendsPanel, "30");
        mainPanel.add(reportPage, "31");

        memberreg.addActionListener(e -> card.show(mainPanel, "1"));
        groupreg.addActionListener(e -> card.show(mainPanel, "2"));
        membercontrib.addActionListener(e -> card.show(mainPanel, "3"));
        groupcontrib.addActionListener(e -> card.show(mainPanel, "4"));
        membercontribstatus.addActionListener(e -> card.show(mainPanel, "5"));
        groupcontribstatus.addActionListener(e -> card.show(mainPanel, "6"));
        groupindividualcontribstatus.addActionListener(e -> card.show(mainPanel, "14"));
        memberborrow.addActionListener(e -> card.show(mainPanel, "7"));
        groupborrow.addActionListener(e -> card.show(mainPanel, "8"));
        groupindividualborrow.addActionListener(e -> card.show(mainPanel, "13"));
        memberpay.addActionListener(e -> card.show(mainPanel, "9"));
        grouppay.addActionListener(e -> card.show(mainPanel, "10"));
        registrationbutton.addActionListener(e -> card.show(mainPanel, "15"));
        contributionbutton.addActionListener(e -> card.show(mainPanel, "16"));
        loanbutton.addActionListener(e -> card.show(mainPanel, "17"));
        reportbutton.addActionListener(e -> card.show(mainPanel, "31"));
        memberpenalty.addActionListener(e -> card.show(mainPanel, "19"));
        grouppaypenalty.addActionListener(e -> card.show(mainPanel, "23"));
        groupindividualpenalty.addActionListener(e -> card.show(mainPanel, "24"));
        memberpenaltystatus.addActionListener(e -> card.show(mainPanel, "25"));
        grouppenaltystatus.addActionListener(e -> card.show(mainPanel, "26"));
        groupindividualpenaltystatus.addActionListener(e -> card.show(mainPanel, "27"));
        memberincomestatus.addActionListener(e -> card.show(mainPanel, "28"));
        groupincomestatus.addActionListener(e -> card.show(mainPanel, "29"));
        groupindividualincomestatus.addActionListener(e -> card.show(mainPanel, "30"));

        MemberRegistration.addActionListener(e -> card.show(mainPanel, "1"));
        GroupRegistration.addActionListener(e -> card.show(mainPanel, "2"));
        MemberContribution.addActionListener(e -> card.show(mainPanel, "3"));
        GroupContribution.addActionListener(e -> card.show(mainPanel, "4"));
        MemberContributionStatus.addActionListener(e -> card.show(mainPanel, "5"));
        GroupContributionStatus.addActionListener(e -> card.show(mainPanel, "6"));
        MemberLoansBorrowed.addActionListener(e -> card.show(mainPanel, "7"));
        GroupLoansBorrowed.addActionListener(e -> card.show(mainPanel, "8"));
        MemberLoansPay.addActionListener(e -> card.show(mainPanel, "9"));
        GroupLoansPay.addActionListener(e -> card.show(mainPanel, "10"));
        MemberLoansStatus.addActionListener(e -> card.show(mainPanel, "11"));
        GroupLoansStatus.addActionListener(e -> card.show(mainPanel, "12"));
        GroupIndividualLoansBorrowed.addActionListener(e -> card.show(mainPanel, "13"));
        GroupContributionIndividualStatus.addActionListener(e -> card.show(mainPanel, "14"));
        GroupIndividualLoansPay.addActionListener(e -> card.show(mainPanel, "18"));
        MemberPenaltyPay.addActionListener(e -> card.show(mainPanel, "19"));
        MemberLoansStatus.addActionListener(e -> card.show(mainPanel, "20"));
        GroupLoansStatus.addActionListener(e -> card.show(mainPanel, "21"));
        GroupIndividualLoansStatus.addActionListener(e -> card.show(mainPanel, "22"));
        GroupPenaltyPay.addActionListener(e -> card.show(mainPanel, "23"));
        GroupIndividualPenaltyPay.addActionListener(e -> card.show(mainPanel, "24"));
        MemberPenaltyStatus.addActionListener(e -> card.show(mainPanel, "25"));
        GroupPenaltyStatus.addActionListener(e -> card.show(mainPanel, "26"));
        GroupIndividualPenaltyStatus.addActionListener(e -> card.show(mainPanel, "27"));
        MemberDividends.addActionListener(e -> card.show(mainPanel, "28"));
        GroupDividends.addActionListener(e -> card.show(mainPanel, "29"));
        GroupIndividualDividends.addActionListener(e -> card.show(mainPanel, "30"));

        // events for buttons
        MemberRegistrationSubmitButton.addActionListener(e -> {
            JOptionPane.showConfirmDialog(frame,"Do you want to save?");
            try{
                MId = Integer.parseInt(MemberRegistrationIdEntry.getText());
                MAge = Integer.parseInt(MemberRegistrationAgeEntry.getText());
                MUsername = MemberRegistrationUNameEntry.getText();
                MFName = MemberRegistrationFNameEntry.getText();
                MLName = MemberRegistrationLNameEntry.getText();
                MEmail = MemberRegistrationMEmailEntry.getText();
                MPhone = MemberRegistrationMPhoneEntry.getText();
                MRegFees = Integer.parseInt(MemberRegistrationRFeesEntry.getText());
                MRegMonth = MemberRegistrationMonthEntry.getSelectedIndex() + 1;
                MRegYear = Integer.parseInt(MemberRegistrationYearEntry.getValue().toString());
                MRegDay = Integer.parseInt(MemberRegistrationDayEntry.getValue().toString());
                float newshares = 0;
                if(MRegFees == 2000){
                    Member.MemberAdd(MId, MUsername, MFName, MLName, MRegDay, MRegMonth, MRegYear, MAge, MRegFees, MEmail, MPhone);
                    Member.AddShares(MId, newshares);
                    Member.AddRepayMent(MId, newshares);
                    Member.MakeContribution(MId, MRegDay, MRegMonth, MRegYear, 0);
                    Member.addPenalty(MId, 0, 0);
                    JOptionPane.showMessageDialog(frame,"Welcome "+MFName+" "+MLName+ "to the organisation");
                    MemberRegistrationResetButton.setEnabled(true);
                    MemberRegistrationUNameEntry.setEnabled(false);
                    MemberRegistrationFNameEntry.setEnabled(false);
                    MemberRegistrationLNameEntry.setEnabled(false);
                    MemberRegistrationRFeesEntry.setEnabled(false);
                    MemberRegistrationMPhoneEntry.setEnabled(false);
                    MemberRegistrationMEmailEntry.setEnabled(false);
                    MemberRegistrationSubmitButton.setEnabled(false);
                    MemberRegistrationIdEntry.setEnabled(false);
                    MemberRegistrationAgeEntry.setEnabled(false);
                    MemberRegistrationYearEntry.setEnabled(false);
                    MemberRegistrationMonthEntry.setEnabled(false);
                    MemberRegistrationDayEntry.setEnabled(false);
                }else JOptionPane.showMessageDialog(frame,"the fee you paid is not enough\n try again");
            }catch (Exception ex){JOptionPane.showMessageDialog(frame,"Experienced error maybe due to incorrect input\n"+ex.getMessage());}
        });
        MemberRegistrationResetButton.addActionListener(e -> {
            JOptionPane.showConfirmDialog(frame,"Do you want to erase the information on the screen?");
            MemberRegistrationResetButton.setEnabled(false);
            MemberRegistrationUNameEntry.setEnabled(true);
            MemberRegistrationFNameEntry.setEnabled(true);
            MemberRegistrationLNameEntry.setEnabled(true);
            MemberRegistrationRFeesEntry.setEnabled(true);
            MemberRegistrationIdEntry.setEnabled(true);
            MemberRegistrationAgeEntry.setEnabled(true);
            MemberRegistrationYearEntry.setEnabled(true);
            MemberRegistrationMonthEntry.setEnabled(true);
            MemberRegistrationSubmitButton.setEnabled(true);
            MemberRegistrationMPhoneEntry.setEnabled(true);
            MemberRegistrationMEmailEntry.setEnabled(true);
            MemberRegistrationDayEntry.setEnabled(true);
            MemberRegistrationMPhoneEntry.setText("");
            MemberRegistrationMEmailEntry.setText("");
            MemberRegistrationUNameEntry.setText("");
            MemberRegistrationFNameEntry.setText("");
            MemberRegistrationLNameEntry.setText("");
            MemberRegistrationRFeesEntry.setText("");
            MemberRegistrationIdEntry.setText("");
            MemberRegistrationAgeEntry.setText("");
        });
        GroupRegistrationSubmitButton.addActionListener(e -> {
            JOptionPane.showConfirmDialog(frame,"Do you want to save?");
            try{
                GMUsername[GCounter] = GroupRegistrationUNameEntry.getText();
                GMFName[GCounter] = GroupRegistrationFNameEntry.getText();
                GMLName[GCounter] = GroupRegistrationLNameEntry.getText();
                GMMemberId[GCounter] = Integer.parseInt(GroupRegistrationMemberIdEntry.getText());
                GName = GroupRegistrationGNameEntry.getText();
                GID = Integer.parseInt(GroupRegistrationGIDEntry.getText());
                GRegFees = Integer.parseInt(GroupRegistrationRFeesEntry.getText());
                GRegDay = Integer.parseInt(GroupRegistrationDayEntry.getValue().toString());
                GRegMonth = GroupRegistrationMonthEntry.getSelectedIndex() + 1;
                GRegYear = Integer.parseInt(GroupRegistrationYearEntry.getValue().toString());
                GEmail[GCounter] = GroupRegistrationEmailEntry.getText();
                GPhone[GCounter] = GroupRegistrationPhoneEntry.getText();
                if(GRegFees == 5000){
                    try{
                        Group.GroupAdd(GID, GName, GRegDay, GRegMonth, GRegYear, GRegFees);
                        Group.AddGroupShares(GID, 0);
                        Group.AddGroupRepayment(GID, 0);
                        Group.addGroupPenalty(GID, 0, 0);
                        for(int x = 0; x <= GCounter; x++){
                            Group.GroupMemberAdd(GMMemberId[x], GID, GMUsername[x], GMFName[x], GMLName[x], GEmail[x], GPhone[x]);
                            Group.AddGroupIndividualShares(GMMemberId[x], 0);
                            Group.AddGroupIndividualRepayment(GMMemberId[x], 0);
                            Group.GroupMakeContribution(GID, GMMemberId[x], 0, GRegDay, GRegMonth, GRegYear);
                            Group.addGroupIndividualPenalty(GMMemberId[x], 0, 0);
                        }
                    }catch(Exception x){JOptionPane.showMessageDialog(frame,x.getMessage());}
                    JOptionPane.showMessageDialog(frame,"Welcome "+GName+" to the organisation");
                    GroupRegistrationGIDEntry.setEnabled(false);
                    GroupRegistrationGNameEntry.setEnabled(false);
                    GroupRegistrationRFeesEntry.setEnabled(false);
                    GroupRegistrationDayEntry.setEnabled(false);
                    GroupRegistrationMonthEntry.setEnabled(false);
                    GroupRegistrationYearEntry.setEnabled(false);
                    GroupRegistrationUNameEntry.setEnabled(false);
                    GroupRegistrationFNameEntry.setEnabled(false);
                    GroupRegistrationLNameEntry.setEnabled(false);
                    GroupRegistrationMemberIdEntry.setEnabled(false);
                    GroupRegistrationSubmitButton.setEnabled(false);
                    GroupRegistrationResetButton.setEnabled(true);
                    GroupRegistrationAddButton.setEnabled(false);
                    GroupRegistrationEmailEntry.setEnabled(false);
                    GroupRegistrationPhoneEntry.setEnabled(false);
                    GCounter = 0;
                }else JOptionPane.showMessageDialog(frame, "you did not put enough money for registration");
            }catch(Exception ex){ JOptionPane.showMessageDialog(frame, ex.getMessage()); }
        });
        GroupRegistrationAddButton.addActionListener(e -> {
            JOptionPane.showConfirmDialog(frame, "Do you want to save this?");
            try{
                GMUsername[GCounter] = GroupRegistrationUNameEntry.getText();
                GMFName[GCounter] = GroupRegistrationFNameEntry.getText();
                GMLName[GCounter] = GroupRegistrationLNameEntry.getText();
                GMMemberId[GCounter] = Integer.parseInt(GroupRegistrationMemberIdEntry.getText());
                GEmail[GCounter] = GroupRegistrationEmailEntry.getText();
                GPhone[GCounter] = GroupRegistrationPhoneEntry.getText();
                GCounter = GCounter + 1;
                GroupRegistrationGIDEntry.setEnabled(false);
                GroupRegistrationGNameEntry.setEnabled(false);
                GroupRegistrationDayEntry.setEnabled(false);
                GroupRegistrationMonthEntry.setEnabled(false);
                GroupRegistrationYearEntry.setEnabled(false);
                GroupRegistrationEmailEntry.setText("");
                GroupRegistrationPhoneEntry.setText("");
                GroupRegistrationUNameEntry.setText("");
                GroupRegistrationFNameEntry.setText("");
                GroupRegistrationLNameEntry.setText("");
                GroupRegistrationMemberIdEntry.setText("");
                if (GCounter >= 1){ GroupRegistrationSubmitButton.setEnabled(true); }
            }catch (Exception ex){ JOptionPane.showMessageDialog(frame, ex.getMessage()); }
        });
        GroupRegistrationResetButton.addActionListener(e -> {
            JOptionPane.showConfirmDialog(frame,"Do you want to erase the information on the screen?");
            GroupRegistrationResetButton.setEnabled(false);
            GroupRegistrationAddButton.setEnabled(true);
            GroupRegistrationGIDEntry.setEnabled(true);
            GroupRegistrationGNameEntry.setEnabled(true);
            GroupRegistrationRFeesEntry.setEnabled(true);
            GroupRegistrationDayEntry.setEnabled(true);
            GroupRegistrationMonthEntry.setEnabled(true);
            GroupRegistrationYearEntry.setEnabled(true);
            GroupRegistrationUNameEntry.setEnabled(true);
            GroupRegistrationFNameEntry.setEnabled(true);
            GroupRegistrationLNameEntry.setEnabled(true);
            GroupRegistrationMemberIdEntry.setEnabled(true);
            GroupRegistrationAddButton.setEnabled(true);
            GroupRegistrationEmailEntry.setEnabled(true);
            GroupRegistrationPhoneEntry.setEnabled(true);
            GroupRegistrationUNameEntry.setText("");
            GroupRegistrationFNameEntry.setText("");
            GroupRegistrationLNameEntry.setText("");
            GroupRegistrationMemberIdEntry.setText("");
            GroupRegistrationGIDEntry.setText("");
            GroupRegistrationGNameEntry.setText("");
            GroupRegistrationRFeesEntry.setText("");
            GroupRegistrationEmailEntry.setText("");
            GroupRegistrationPhoneEntry.setText("");
        });
        MemberContributionSubmitButton.addActionListener(e -> {
            JOptionPane.showConfirmDialog(frame,"Do you want to save?");
            try{
                MId = Integer.parseInt(MemberContributionIDEntry.getText());
                MContribution = Float.parseFloat(MemberContributionContributionEntry.getText());
                MContribDay = Integer.parseInt(MemberContributionDayEntry.getValue().toString());
                MContribMonth = MemberContributionMonthEntry.getSelectedIndex() + 1;
                MContribYear = Integer.parseInt(MemberContributionYearEntry.getValue().toString());
                int timetaken1 = Miscallenous.calculateTimetaken(MContribYear, MContribMonth, Member.getContributionYear(MId), Member.getContributionMonth(MId));
                if (timetaken1 >= 0) {
                    if (MContribution >= 1000) {
                        MShare = Member.GetShares(MId) + MContribution;
                        Member.MakeContribution(MId, MContribDay, MContribMonth, MContribYear, MContribution);
                        Member.UpdateShares(MId, MShare);
                        JOptionPane.showMessageDialog(frame, "Thank you for contributing");
                        MemberContributionResetButton.setEnabled(true);
                        MemberContributionIDEntry.setEnabled(false);
                        MemberContributionContributionEntry.setEnabled(false);
                        MemberContributionDayEntry.setEnabled(false);
                        MemberContributionMonthEntry.setEnabled(false);
                        MemberContributionSubmitButton.setEnabled(false);
                        MemberContributionYearEntry.setEnabled(false);
                    } else JOptionPane.showMessageDialog(frame, "not enough cash");
                }else JOptionPane.showMessageDialog(frame, "invalid date");
            }catch (Exception ex){JOptionPane.showMessageDialog(frame,"Experienced error maybe due to incorrect input\n"+ex.getMessage());}
        });
        MemberContributionResetButton.addActionListener(e -> {
            JOptionPane.showConfirmDialog(frame,"Do you want to erase the information on the screen?");
            MemberContributionResetButton.setEnabled(false);
            MemberContributionIDEntry.setEnabled(true);
            MemberContributionContributionEntry.setEnabled(true);
            MemberContributionDayEntry.setEnabled(true);
            MemberContributionMonthEntry.setEnabled(true);
            MemberContributionSubmitButton.setEnabled(true);
            MemberContributionYearEntry.setEnabled(true);
            MemberContributionIDEntry.setText("");
            MemberContributionContributionEntry.setText("");
        });
        MemberContributionStatusSubmitButton.addActionListener(e -> {
            try{
                MId = Integer.parseInt(MemberContributionStatusIdEntry.getText());
                MemberContributionStatusResultFNameLabel.setText(""+Member.GetFname(MId));
                MemberContributionStatusResultLNameLabel.setText(""+Member.GetLname(MId));
                MemberContributionStatusResultUnameLabel.setText(""+Member.GetUserName(MId));
                MemberContributionStatusSharesResultLabel.setText(""+Member.GetShares(MId));
            }catch(Exception ex){JOptionPane.showMessageDialog(frame, ex.getMessage());}
        });
        GroupContributionSubmitButton.addActionListener(e -> {
            JOptionPane.showConfirmDialog(frame,"Do you want to save?");
            try{
                GID = Integer.parseInt(GroupContributionGroupIdEntry.getText());
                int GMMemberd = Integer.parseInt(GroupContributionMemberIdEntry.getText());
                GContribution = Float.parseFloat(GroupContributionContributionEntry.getText());
                GContribDay = Integer.parseInt(GroupContributionDayEntry.getValue().toString());
                GContribMonth = GroupContributionMonthEntry.getSelectedIndex() + 1;
                GContribYear = Integer.parseInt(GroupContributionYearEntry.getValue().toString());
                int timetaken1 = Miscallenous.calculateTimetaken(GContribYear, GContribMonth, Group.getContributionYear(GMMemberd), Group.getContributionMonth(GMMemberd));
                if (timetaken1 >= 0) {
                    if (GContribution >= 1000) {
                        Group.GroupMakeContribution(GID, GMMemberd, GContribution, GContribDay, GContribMonth, GContribYear);
                        float gshare = Group.GetGroupShares(GID) + 200;
                        Group.UpdateGroupShares(GID, gshare);
                        float gmshare = Group.GetGroupIndividualShares(GMMemberd) + GContribution - 200;
                        Group.UpdateGroupIndividualShares(GMMemberd, gmshare);
                        JOptionPane.showMessageDialog(frame, "Thank you for contributing");
                        GroupContributionResetButton.setEnabled(true);
                        GroupContributionMemberIdEntry.setEnabled(false);
                        GroupContributionContributionEntry.setEnabled(false);
                        GroupContributionDayEntry.setEnabled(false);
                        GroupContributionMonthEntry.setEnabled(false);
                        GroupContributionSubmitButton.setEnabled(false);
                        GroupContributionYearEntry.setEnabled(false);
                        GroupContributionGroupIdEntry.setEnabled(false);
                    } else JOptionPane.showMessageDialog(frame, "please add more money", "group contribution", JOptionPane.ERROR_MESSAGE);
                }else JOptionPane.showMessageDialog(frame, "invalid date");
            }catch(Exception ex){JOptionPane.showMessageDialog(frame, ex.getMessage(),"group contribution",JOptionPane.ERROR_MESSAGE);}
        });
        GroupContributionResetButton.addActionListener(e -> {
            JOptionPane.showConfirmDialog(frame,"Do you want to erase the information on the screen");
            GroupContributionResetButton.setEnabled(false);
            GroupContributionMemberIdEntry.setEnabled(true);
            GroupContributionContributionEntry.setEnabled(true);
            GroupContributionGroupIdEntry.setEnabled(true);
            GroupContributionDayEntry.setEnabled(true);
            GroupContributionMonthEntry.setEnabled(true);
            GroupContributionSubmitButton.setEnabled(true);
            GroupContributionYearEntry.setEnabled(true);
            GroupContributionGroupIdEntry.setText("");
            GroupContributionMemberIdEntry.setText("");
            GroupContributionContributionEntry.setText("");
        });
        GroupContributionStatusSubmitButton.addActionListener(e -> {
            try{
                GID = Integer.parseInt(GroupContributionStatusGIdEntry.getText());
                GroupContributionStatusResultGNameLabel.setText(""+Group.GetGName(GID));
                GroupContributionStatusResultSharesLabel.setText(""+Group.GetGroupShares(GID));
            }catch(Exception ex){JOptionPane.showMessageDialog(frame, ex.getMessage());}
        });
        GroupContributionIndividualStatusSubmitButton.addActionListener(e -> {
            try{
                MId = Integer.parseInt(GroupContributionIndividualStatusIdEntry.getText());
                GroupContributionIndividualStatusResultFnameLabel.setText(""+Group.GetFname(MId));
                GroupContributionIndividualStatusResultLnameLabel.setText(""+Group.GetLname(MId));
                GroupContributionIndividualStatusResultUnameLabel.setText(""+Group.GetUserName(MId));
                GroupContributionIndividualStatusResultSharesLabel.setText(""+Group.GetGroupIndividualShares(MId));
            }catch(Exception ex){JOptionPane.showMessageDialog(frame, ex.getMessage());}
        });
        MemberLoansBorrowedSubmitButton.addActionListener(e -> {
            JOptionPane.showConfirmDialog(frame,"Do you want to save?");
            try{
                MId = Integer.parseInt(MemberLoansBorrowedIdEntry.getText());
                MLoan = Float.parseFloat(MemberLoansBorrowedLoansEntry.getText());
                MLoanDay = Integer.parseInt(MemberLoansBorrowedDayEntry.getValue().toString());
                MLoanMonth = MemberLoansBorrowedMonthEntry.getSelectedIndex() + 1;
                MLoanYear = Integer.parseInt(MemberLoansBorrowedYearEntry.getValue().toString());
                float mmembershare = Member.GetShares(MId);
                float memberloanable = mmembershare * 3;
                float repay = Member.getRepayMent(MId) + MLoan;
                float repay1 = Member.getRepayMent(MId);
                if (repay1 == 0) {
                    if (MLoan <= memberloanable) {
                        Member.BorrowLoan(MId, MLoan, MLoanDay, MLoanMonth, MLoanYear);
                        Member.UpdateRepayMent(MId, repay);
                        Member.AddInterest(MId, 0);
                        JOptionPane.showMessageDialog(frame, "Congratulations your loan has been approved");
                        MemberLoansBorrowedResetButton.setEnabled(true);
                        MemberLoansBorrowedIdEntry.setEnabled(false);
                        MemberLoansBorrowedLoansEntry.setEnabled(false);
                        MemberLoansBorrowedDayEntry.setEnabled(false);
                        MemberLoansBorrowedMonthEntry.setEnabled(false);
                        MemberLoansBorrowedSubmitButton.setEnabled(false);
                        MemberLoansBorrowedYearEntry.setEnabled(false);
                    } else JOptionPane.showMessageDialog(frame, "please enter a lesser amount","member loans",JOptionPane.ERROR_MESSAGE);
                }else JOptionPane.showMessageDialog(frame, "you have an outstanding loan","member loans",JOptionPane.ERROR_MESSAGE);
            }catch(Exception ex){ JOptionPane.showMessageDialog(frame,"Experienced error maybe due to incorrect input\n"+ex.getMessage(),"member loans",JOptionPane.ERROR_MESSAGE); }
        });
        MemberLoansBorrowedResetButton.addActionListener(e -> {
            JOptionPane.showConfirmDialog(frame,"Do you want to erase the information on the screen?");
            MemberLoansBorrowedResetButton.setEnabled(false);
            MemberLoansBorrowedIdEntry.setEnabled(true);
            MemberLoansBorrowedLoansEntry.setEnabled(true);
            MemberLoansBorrowedDayEntry.setEnabled(true);
            MemberLoansBorrowedMonthEntry.setEnabled(true);
            MemberLoansBorrowedSubmitButton.setEnabled(true);
            MemberLoansBorrowedYearEntry.setEnabled(true);
            MemberLoansBorrowedIdEntry.setText("");
            MemberLoansBorrowedLoansEntry.setText("");
        });
        GroupLoansBorrowedSubmitButton.addActionListener(e -> {
            JOptionPane.showConfirmDialog(frame,"Do you want to save?");
            try{
                GID = Integer.parseInt(GroupLoansBorrowedIdEntry.getText());
                GLoan = Float.parseFloat(GroupLoansBorrowedLoansEntry.getText());
                GLoanDay = Integer.parseInt(GroupLoansBorrowedDayEntry.getValue().toString());
                GLoanMonth = GroupLoansBorrowedMonthEntry.getSelectedIndex() + 1;
                GLoanYear = Integer.parseInt(GroupLoansBorrowedYearEntry.getValue().toString());
                float gshare = Group.GetGroupShares(GID);
                float gshareloanable = gshare * 3;
                float repay = Group.GetGroupRepayMent(GID) + GLoan;
                float repay1 = Group.GetGroupRepayMent(GID);
                if (repay1 == 0) {
                    if (GLoan <= gshareloanable) {
                        Group.GroupLoan(GID, GLoan, GLoanDay, GLoanMonth, GLoanYear);
                        Group.UpdateGroupRepayment(GID, repay);
                        Group.AddGroupInterest(GID, 0);
                        JOptionPane.showMessageDialog(frame, "Congratulations your loan has been approved");
                        GroupLoansBorrowedResetButton.setEnabled(true);
                        GroupLoansBorrowedIdEntry.setEnabled(false);
                        GroupLoansBorrowedLoansEntry.setEnabled(false);
                        GroupLoansBorrowedDayEntry.setEnabled(false);
                        GroupLoansBorrowedMonthEntry.setEnabled(false);
                        GroupLoansBorrowedSubmitButton.setEnabled(false);
                        GroupLoansBorrowedYearEntry.setEnabled(false);
                    } else JOptionPane.showMessageDialog(frame, "please enter a lesser amount","group loans", JOptionPane.ERROR_MESSAGE);
                }else JOptionPane.showMessageDialog(frame, "you have some outstanding balance in your account","group loans", JOptionPane.ERROR_MESSAGE);
            }catch(Exception ex){JOptionPane.showMessageDialog(frame, ex.getMessage(),"group loans", JOptionPane.ERROR_MESSAGE);}
        });
        GroupLoansBorrowedResetButton.addActionListener(e -> {
            JOptionPane.showConfirmDialog(frame,"Do you want to erase the information on the screen");
            GroupLoansBorrowedResetButton.setEnabled(false);
            GroupLoansBorrowedIdEntry.setEnabled(true);
            GroupLoansBorrowedLoansEntry.setEnabled(true);
            GroupLoansBorrowedDayEntry.setEnabled(true);
            GroupLoansBorrowedMonthEntry.setEnabled(true);
            GroupLoansBorrowedSubmitButton.setEnabled(true);
            GroupLoansBorrowedYearEntry.setEnabled(true);
            GroupLoansBorrowedIdEntry.setText("");
            GroupLoansBorrowedLoansEntry.setText("");
        });
        GroupIndividualLoansBorrowedSubmitButton.addActionListener(e -> {
            JOptionPane.showConfirmDialog(frame,"Do you want to save?");
            try{
                GID = Integer.parseInt(GroupIndividualLoansBorrowedIdEntry.getText());
                GLoan = Float.parseFloat(GroupIndividualLoansBorrowedLoanEntry.getText());
                GLoanDay = Integer.parseInt(GroupIndividualLoansBorrowedDayEntry.getValue().toString());
                GLoanMonth = GroupIndividualLoansBorrowedMonthEntry.getSelectedIndex() + 1;
                GLoanYear = Integer.parseInt(GroupIndividualLoansBorrowedYearEntry.getValue().toString());
                float gshare = Group.GetGroupIndividualShares(GID);
                float gshareloanable = gshare * 4;
                float repay = Group.GetGroupIndividualRepayMent(GID) + GLoan;
                float repay1 = Group.GetGroupIndividualRepayMent(GID);
                if (repay1 == 0) {
                    if (GLoan <= gshareloanable) {
                        Group.GroupIndividualLoan(GID, GLoan, GLoanDay, GLoanMonth, GLoanYear);
                        Group.UpdateGroupIndividualRepayMent(GID, repay);
                        Group.AddGroupIndividualInterest(GID, 0);
                        JOptionPane.showMessageDialog(frame, "Congratulations your loan has been approved");
                        GroupIndividualLoansBorrowedResetButton.setEnabled(true);
                        GroupIndividualLoansBorrowedIdEntry.setEnabled(false);
                        GroupIndividualLoansBorrowedLoanEntry.setEnabled(false);
                        GroupIndividualLoansBorrowedDayEntry.setEnabled(false);
                        GroupIndividualLoansBorrowedMonthEntry.setEnabled(false);
                        GroupIndividualLoansBorrowedSubmitButton.setEnabled(false);
                        GroupIndividualLoansBorrowedYearEntry.setEnabled(false);
                    } else JOptionPane.showMessageDialog(frame, "please enter a lesser amount");
                }else JOptionPane.showMessageDialog(frame, "you have some outstanding balance in your account");
            }catch(Exception ex){JOptionPane.showMessageDialog(frame, ex.getMessage());}
        });
        GroupIndividualLoansBorrowedResetButton.addActionListener(e -> {
            JOptionPane.showConfirmDialog(frame,"Do you want to erase the information on the screen");
            GroupIndividualLoansBorrowedResetButton.setEnabled(false);
            GroupIndividualLoansBorrowedIdEntry.setEnabled(true);
            GroupIndividualLoansBorrowedLoanEntry.setEnabled(true);
            GroupIndividualLoansBorrowedDayEntry.setEnabled(true);
            GroupIndividualLoansBorrowedMonthEntry.setEnabled(true);
            GroupIndividualLoansBorrowedSubmitButton.setEnabled(true);
            GroupIndividualLoansBorrowedYearEntry.setEnabled(true);
            GroupIndividualLoansBorrowedIdEntry.setText("");
            GroupIndividualLoansBorrowedLoanEntry.setText("");
        });
        MemberLoansPaySubmitButton.addActionListener(e -> {
            JOptionPane.showConfirmDialog(frame,"Do you want to save?");
            try{
                MId = Integer.parseInt(MemberLoansPayIdEntry.getText());
                MLoan = Float.parseFloat(MemberLoansPayPayEntry.getText());
                MLoanDay = Integer.parseInt(MemberLoansPayDayEntry.getValue().toString());
                MLoanMonth = MemberLoansPayMonthEntry.getSelectedIndex() + 1;
                MLoanYear = Integer.parseInt(MemberLoansPayYearEntry.getValue().toString());
                int timetaken = Miscallenous.calculateTimetaken(MLoanYear, MLoanMonth, Member.getloanyear(MId), Member.getloanmonth(MId));
                if (timetaken >= 0) {
                    float deposit = Member.getLoan(MId);
                    float interest = Miscallenous.getInterest(timetaken, deposit, 2.5f);
                    Member.UpdateInterest(MId, interest);
                    float repay = Member.getRepayMent(MId) + interest;
                    if(timetaken > 36){
                        float penalty = (repay * 10/100) + Member.GetPenalty(MId);
                        float penalty1 = (repay * 10/100) + Member.GetTotalPenalty(MId);
                        Member.UpdatePenalty(MId, penalty, penalty1);
                    }
                    if (repay > MLoan) {
                        repay = repay - MLoan;
                        Member.UpdateRepayMent(MId, repay);
                        Member.MakePay(MId, MLoan, MLoanDay, MLoanMonth, MLoanYear);
                    } else {
                        repay = MLoan - repay;
                        Member.UpdateRepayMent(MId, 0);
                        MShare = Member.GetShares(MId) + repay;
                        Member.UpdateShares(MId, MShare);
                        Member.MakePay(MId, repay, MLoanDay, MLoanMonth, MLoanYear);
                        JOptionPane.showMessageDialog(frame, "you have cleared your loan");
                    }
                    JOptionPane.showMessageDialog(frame, "the payment has been made successfully");
                    MemberLoansPayResetButton.setEnabled(true);
                    MemberLoansPayIdEntry.setEnabled(false);
                    MemberLoansPayPayEntry.setEnabled(false);
                    MemberLoansPayDayEntry.setEnabled(false);
                    MemberLoansPayMonthEntry.setEnabled(false);
                    MemberLoansPaySubmitButton.setEnabled(false);
                    MemberLoansPayYearEntry.setEnabled(false);
                }else JOptionPane.showMessageDialog(frame, "please enter the correct date");
            }catch(Exception ex){ JOptionPane.showMessageDialog(frame,"Experienced error maybe due to incorrect input\n"+ex.getMessage()); }
        });
        MemberLoansPayResetButton.addActionListener(e -> {
            JOptionPane.showConfirmDialog(frame,"Do you want to erase the information on the screen");
            MemberLoansPayResetButton.setEnabled(false);
            MemberLoansPayIdEntry.setEnabled(true);
            MemberLoansPayPayEntry.setEnabled(true);
            MemberLoansPayDayEntry.setEnabled(true);
            MemberLoansPayMonthEntry.setEnabled(true);
            MemberLoansPaySubmitButton.setEnabled(true);
            MemberLoansPayYearEntry.setEnabled(true);
            MemberLoansPayIdEntry.setText("");
            MemberLoansPayPayEntry.setText("");
        });
        GroupLoansPaySubmitButton.addActionListener(e -> {
            JOptionPane.showConfirmDialog(frame,"Do you want to save?");
            try{
                GID = Integer.parseInt(GroupLoansPayIdEntry.getText());
                float GPay = Float.parseFloat(GroupLoansPayPayEntry.getText());
                GLoanDay = Integer.parseInt(GroupLoansPayDayEntry.getValue().toString());
                GLoanMonth = GroupLoansPayMonthEntry.getSelectedIndex() + 1;
                GLoanYear = Integer.parseInt(GroupLoansPayYearEntry.getValue().toString());
                int timetaken = Miscallenous.calculateTimetaken(GLoanYear, GLoanMonth, Group.getGrouploanyear(GID), Group.getGrouploanmonth(GID));
                if (timetaken >= 0) {
                    float deposit = Group.getGroupLoan(GID);
                    float interest = Miscallenous.getInterest(timetaken, deposit, 0.8f);
                    Group.UpdateGroupInterest(GID, interest);
                    float repay = Group.GetGroupRepayMent(GID) + interest;
                    if (timetaken > 60) {
                        float penalty = (repay * 10/100) + Group.GetGroupPenalty(GID);
                        float penalty1 = (repay * 10/100) + Group.GetGroupPenaltyTotal(GID);
                        Group.UpdateGroupPenalty(GID, penalty, penalty1);
                    }
                    if (repay > GPay) {
                        repay = repay - GPay;
                        Group.UpdateGroupRepayment(GID, repay);
                        Group.GroupPay(GID, GPay, GLoanDay, GLoanMonth, GLoanYear);
                    } else {
                        repay = MLoan - repay;
                        Group.UpdateGroupRepayment(GID, 0);
                        float GShares = Group.GetGroupShares(GID) + repay;
                        Group.UpdateGroupShares(GID, GShares);
                        Group.GroupPay(GID, repay, GLoanDay, GLoanMonth, GLoanYear);
                        JOptionPane.showMessageDialog(frame, "you have cleared your loan");
                    }
                    JOptionPane.showMessageDialog(frame, "the payment has been successfully received");
                    GroupLoansPayResetButton.setEnabled(true);
                    GroupLoansPayIdEntry.setEnabled(false);
                    GroupLoansPayPayEntry.setEnabled(false);
                    GroupLoansPayDayEntry.setEnabled(false);
                    GroupLoansPayMonthEntry.setEnabled(false);
                    GroupLoansPaySubmitButton.setEnabled(false);
                    GroupLoansPayYearEntry.setEnabled(false);
                }else JOptionPane.showMessageDialog(frame, "you entered an incorrect date");
            }catch(Exception ex){JOptionPane.showMessageDialog(frame, ex.getMessage());}
        });
        GroupLoansPayResetButton.addActionListener(e -> {
            JOptionPane.showConfirmDialog(frame,"Do you want to erase the information on the screen");
            GroupLoansPayResetButton.setEnabled(false);
            GroupLoansPayIdEntry.setEnabled(true);
            GroupLoansPayPayEntry.setEnabled(true);
            GroupLoansPayDayEntry.setEnabled(true);
            GroupLoansPayMonthEntry.setEnabled(true);
            GroupLoansPaySubmitButton.setEnabled(true);
            GroupLoansPayYearEntry.setEnabled(true);
            GroupLoansPayIdEntry.setText("");
            GroupLoansPayPayEntry.setText("");
        });
        GroupIndividualLoansPaySubmitButton.addActionListener(e -> {
            JOptionPane.showConfirmDialog(frame,"Do you want to save?");
            try{
                GID = Integer.parseInt(GroupIndividualLoansPayIdEntry.getText());
                float GPay = Float.parseFloat(GroupIndividualLoansPayPayEntry.getText());
                GLoanDay = Integer.parseInt(GroupIndividualLoansPayDayEntry.getValue().toString());
                GLoanMonth = GroupIndividualLoansPayMonthEntry.getSelectedIndex() + 1;
                GLoanYear = Integer.parseInt(GroupIndividualLoansPayYearEntry.getValue().toString());
                int timetaken = Miscallenous.calculateTimetaken(GLoanYear, GLoanMonth, Group.getGroupIndividualloanyear(GID), Group.getGroupIndividualloanmonth(GID));
                if (timetaken >= 0) {
                    float deposit = Group.getGroupIndividualLoan(GID);
                    float interest = Miscallenous.getInterest(timetaken, deposit, 1);
                    Group.UpdateGroupIndividualInterest(GID, interest);
                    float repay = Group.GetGroupIndividualRepayMent(GID);
                    if(timetaken > 48){
                        float penalty = (repay * 10/100) + Group.GetGroupIndividualPenalty(GID);
                        float penalty1 = (repay * 10/100) + Group.GetGroupIndividualPenaltyTotal(GID);
                        Group.UpdateGroupIndividualPenalty(GID, penalty, penalty1);
                    }
                    if (repay > GPay) {
                        repay = repay - GPay;
                        Group.UpdateGroupIndividualRepayMent(GID, repay);
                        Group.GroupIndividualPay(GID, GPay, GLoanDay, GLoanMonth, GLoanYear);
                    } else {
                        repay = GPay - repay;
                        Group.UpdateGroupIndividualRepayMent(GID, 0);
                        float GShares = Group.GetGroupIndividualShares(GID) + repay;
                        Group.UpdateGroupIndividualShares(GID, GShares);
                        Group.GroupIndividualPay(GID, repay, GLoanDay, GLoanMonth, GLoanYear);
                        JOptionPane.showMessageDialog(frame, "you have cleared your loan");
                    }
                    JOptionPane.showMessageDialog(frame, "Congratulations your loan has been approved");
                    GroupIndividualLoansPayResetButton.setEnabled(true);
                    GroupIndividualLoansPayIdEntry.setEnabled(false);
                    GroupIndividualLoansPayPayEntry.setEnabled(false);
                    GroupIndividualLoansPayDayEntry.setEnabled(false);
                    GroupIndividualLoansPayMonthEntry.setEnabled(false);
                    GroupIndividualLoansPaySubmitButton.setEnabled(false);
                    GroupIndividualLoansPayYearEntry.setEnabled(false);
                }else JOptionPane.showMessageDialog(frame, "you entered an incorrect date", "group individual pay", JOptionPane.ERROR_MESSAGE);
            }catch(Exception ex){JOptionPane.showMessageDialog(frame, ex.getMessage(), "group individual pay", JOptionPane.ERROR_MESSAGE);}
        });
        GroupIndividualLoansPayResetButton.addActionListener(e -> {
            JOptionPane.showConfirmDialog(frame,"Do you want to erase the information on the screen");
            GroupIndividualLoansPayResetButton.setEnabled(false);
            GroupIndividualLoansPayIdEntry.setEnabled(true);
            GroupIndividualLoansPayPayEntry.setEnabled(true);
            GroupIndividualLoansPayDayEntry.setEnabled(true);
            GroupIndividualLoansPayMonthEntry.setEnabled(true);
            GroupIndividualLoansPaySubmitButton.setEnabled(true);
            GroupIndividualLoansPayYearEntry.setEnabled(true);
            GroupIndividualLoansPayIdEntry.setText("");
            GroupIndividualLoansPayPayEntry.setText("");
        });
        MemberLoansStatusSubmitButton.addActionListener(e -> {
            try{
                MId = Integer.parseInt(MemberLoansStatusIDEntry.getText());
                MemberLoansStatusFNameEntry.setText(""+Member.GetFname(MId));
                MemberLoansStatusLNameEntry.setText(""+Member.GetLname(MId));
                MemberLoansStatusLoanEntry.setText(""+Member.getLoan(MId));
                MemberLoansStatusRepayEntry.setText(""+Member.getRepayMent(MId));
                MemberLoansStatusInterestEntry.setText(""+Member.getinterest(MId));
            }catch (Exception ex) {JOptionPane.showMessageDialog(frame,ex.getMessage(),"member loans status",JOptionPane.ERROR_MESSAGE);}
        });
        GroupLoansStatusSubmitButton.addActionListener(e -> {
            try {
                GID = Integer.parseInt(GroupLoansStatusIDEntry.getText());
                GroupLoansStatusNameEntry.setText(""+Group.GetGName(GID));
                GroupLoansStatusLoanEntry.setText(""+Group.getGroupLoan(GID));
                GroupLoansStatusRepayEntry.setText(""+Group.GetGroupRepayMent(GID));
                GroupLoansStatusInterestEntry.setText(""+Group.getGroupInterest(GID));
            }catch (Exception ex) {JOptionPane.showMessageDialog(frame,ex.getMessage(),"group loans status",JOptionPane.ERROR_MESSAGE);}
        });
        GroupIndividualLoansStatusSubmitButton.addActionListener(e -> {
            try{
                GID = Integer.parseInt(GroupIndividualLoansStatusIDEntry.getText());
                GroupIndividualLoansStatusFNameEntry.setText(""+Group.GetFname(GID));
                GroupIndividualLoansStatusLNameEntry.setText(""+Group.GetLname(GID));
                GroupIndividualLoansStatusLoanEntry.setText(""+Group.getGroupIndividualLoan(GID));
                GroupIndividualLoansStatusRepayEntry.setText(""+Group.GetGroupIndividualRepayMent(GID));
                GroupLoansStatusInterestEntry.setText(""+Group.getGroupIndividualInterest(GID));
            }catch (Exception ex) {JOptionPane.showMessageDialog(frame,ex.getMessage(),"group individual loans status",JOptionPane.ERROR_MESSAGE);}
        });
        MemberPenaltyPayPanelSubmitButton.addActionListener(e -> {
            JOptionPane.showConfirmDialog(frame, "do you want to save this information");
            try{
                MId = Integer.parseInt(MemberPenaltyPayPanelIDEntry.getText());
                float amount = Float.parseFloat(MemberPenaltyPayPanelAmountEntry.getText());
                float penalty = Member.GetPenalty(MId);
                float penalty1 = Member.GetTotalPenalty(MId);
                if (penalty > amount){
                    penalty = penalty - amount;
                    Member.UpdatePenalty(MId, penalty, penalty1);
                }else{
                    penalty = amount - penalty;
                    Member.UpdatePenalty(MId, 0, penalty1);
                    MShare = Member.GetShares(MId) + penalty;
                    Member.UpdateShares(MId, MShare);
                    JOptionPane.showMessageDialog(frame, "you have cleared all the outstanding penalties");
                }
                JOptionPane.showMessageDialog(frame, "payment made successfully");
                MemberPenaltyPayPanelIDEntry.setEnabled(false);
                MemberPenaltyPayPanelAmountEntry.setEnabled(false);
                MemberPenaltyPayPanelSubmitButton.setEnabled(false);
                MemberPenaltyPayPanelResetButton.setEnabled(true);
            }catch (Exception ex) {JOptionPane.showMessageDialog(frame,ex.getMessage(),"group individual loans status",JOptionPane.ERROR_MESSAGE);}
        });
        MemberPenaltyPayPanelResetButton.addActionListener(e -> {
            JOptionPane.showConfirmDialog(frame, "do you want to erase all the information?");
            MemberPenaltyPayPanelIDEntry.setEnabled(true);
            MemberPenaltyPayPanelAmountEntry.setEnabled(true);
            MemberPenaltyPayPanelIDEntry.setText("");
            MemberPenaltyPayPanelAmountEntry.setText("");
            MemberPenaltyPayPanelSubmitButton.setEnabled(true);
            MemberPenaltyPayPanelResetButton.setEnabled(false);
        });
        GroupPenaltyPaySubmitButton.addActionListener(e -> {
            JOptionPane.showConfirmDialog(frame, "do you want to save this information");
            try {
                GID = Integer.parseInt(GroupPenaltyPayIDEntry.getText());
                float amount = Float.parseFloat(GroupPenaltyPayAmountEntry.getText());
                float penalty = Group.GetGroupPenalty(GID);
                float penaltytotal = Group.GetGroupPenaltyTotal(GID);
                if (penalty > amount){
                    penalty = penalty - amount;
                    Group.UpdateGroupPenalty(MId, penalty, penaltytotal);
                }else{
                    penalty = amount - penalty;
                    Group.UpdateGroupPenalty(MId, 0, penaltytotal);
                    float GShares = Group.GetGroupShares(GID) + penalty;
                    Group.UpdateGroupShares(GID, GShares);
                    JOptionPane.showMessageDialog(frame, "you have cleared all the outstanding penalties");
                }
                JOptionPane.showMessageDialog(frame, "payment made successfully");
                GroupPenaltyPayIDEntry.setEnabled(false);
                GroupPenaltyPayAmountEntry.setEnabled(false);
                GroupPenaltyPaySubmitButton.setEnabled(false);
                GroupPenaltyPayResetButton.setEnabled(true);
            }catch (Exception ex) {JOptionPane.showMessageDialog(frame,ex.getMessage(),"group individual loans status",JOptionPane.ERROR_MESSAGE);}
        });
        GroupPenaltyPayResetButton.addActionListener(e -> {
            JOptionPane.showConfirmDialog(frame, "do you want to erase all the information?");
            GroupPenaltyPayIDEntry.setEnabled(true);
            GroupPenaltyPayAmountEntry.setEnabled(true);
            GroupPenaltyPayIDEntry.setText("");
            GroupPenaltyPayAmountEntry.setText("");
            GroupPenaltyPaySubmitButton.setEnabled(true);
            GroupPenaltyPayResetButton.setEnabled(false);
        });
        GroupIndividualPenaltyPaySubmitButton.addActionListener(e -> {
            JOptionPane.showConfirmDialog(frame, "do you want to save this information");
            try {
                GID = Integer.parseInt(GroupIndividualPenaltyPayIDEntry.getText());
                float amount = Float.parseFloat(GroupIndividualPenaltyPayAmountEntry.getText());
                float penalty = Group.GetGroupIndividualPenalty(GID);
                float penalty1 = Group.GetGroupIndividualPenaltyTotal(GID);
                if (penalty > amount){
                    penalty = penalty - amount;
                    Group.UpdateGroupIndividualPenalty(GID, penalty, penalty1);
                }else{
                    penalty = amount - penalty;
                    Group.UpdateGroupIndividualPenalty(GID, 0, penalty1);
                    float GShares = Group.GetGroupIndividualShares(GID) + penalty;
                    Group.UpdateGroupIndividualShares(GID, GShares);
                    JOptionPane.showMessageDialog(frame, "you have cleared all the outstanding penalties");
                }
                JOptionPane.showMessageDialog(frame, "payment made successfully");
                GroupIndividualPenaltyPayIDEntry.setEnabled(false);
                GroupIndividualPenaltyPayAmountEntry.setEnabled(false);
                GroupIndividualPenaltyPaySubmitButton.setEnabled(false);
                GroupIndividualPenaltyPayResetButton.setEnabled(true);
            }catch (Exception ex) {JOptionPane.showMessageDialog(frame,ex.getMessage());}
        });
        GroupIndividualPenaltyPayResetButton.addActionListener(e -> {
            JOptionPane.showConfirmDialog(frame, "do you want to erase all the information?");
            GroupIndividualPenaltyPayIDEntry.setEnabled(true);
            GroupIndividualPenaltyPayAmountEntry.setEnabled(true);
            GroupIndividualPenaltyPayIDEntry.setText("");
            GroupIndividualPenaltyPayAmountEntry.setText("");
            GroupIndividualPenaltyPaySubmitButton.setEnabled(true);
            GroupIndividualPenaltyPayResetButton.setEnabled(false);
        });
        MemberPenaltyStatusSubmitButton.addActionListener(e -> {
            try{
                MId = Integer.parseInt(MemberPenaltyStatusIDEntry.getText());
                MemberPenaltyStatusFNameEntry.setText(""+Member.GetFname(MId));
                MemberPenaltyStatusLNameEntry.setText(""+Member.GetLname(MId));
                MemberPenaltyStatusPenaltyEntry.setText(""+Member.GetPenalty(MId));
            }catch (Exception ex) {JOptionPane.showMessageDialog(frame,ex.getMessage());}
        });
        GroupPenaltyStatusSubmitButton.addActionListener(e -> {
            try{
                GID = Integer.parseInt(GroupPenaltyStatusIDEntry.getText());
                GroupPenaltyStatusNameEntry.setText(""+Group.GetGName(GID));
                GroupPenaltyStatusPenaltyEntry.setText(""+Group.GetGroupPenalty(GID));
            }catch (Exception ex) {JOptionPane.showMessageDialog(frame,ex.getMessage());}
        });
        GroupIndividualPenaltyStatusSubmitButton.addActionListener(e -> {
            try{
                GID = Integer.parseInt(GroupIndividualPenaltyStatusIDEntry.getText());
                GroupIndividualPenaltyStatusFNameEntry.setText(""+Group.GetFname(GID));
                GroupIndividualPenaltyStatusLNameEntry.setText(""+Group.GetLname(GID));
                GroupIndividualPenaltyStatusPenaltyEntry.setText(""+Group.GetGroupIndividualPenalty(GID));
            }catch (Exception ex) {JOptionPane.showMessageDialog(frame,ex.getMessage());}
        });
        MemberDividendsSubmitButton.addActionListener(e -> {
            try{
                MId = Integer.parseInt(MemberDividendsIDEntry.getText());
                MemberDividendsFNameEntry.setText(""+Member.GetFname(MId));
                MemberDividendsLNameEntry.setText(""+Member.GetLname(MId));
                float totalshares = Miscallenous.totalItems(Member.getAllShares(), Group.getGroupAllShares(), Group.getGroupIndividualAllShares());
                float totalinterest = Miscallenous.totalItems(Member.getAllInterests(), Group.getGroupAllInterests(), Group.getGroupIndividualAllInterests());
                float totalpenalty = Miscallenous.totalItems(Member.getAllPenalties(), Group.getGroupAllPenalties(), Group.getGroupIndividualAllPenalties());
                float income = Miscallenous.sumItems(totalinterest, totalpenalty);
                float dividends = Miscallenous.totatDividends(Member.GetShares(MId), totalshares, income);
                MemberDividendsDividendsEntry.setText(""+dividends);
            }catch (Exception ex) {JOptionPane.showMessageDialog(frame,ex.getMessage());}
        });
        GroupPenaltyStatusSubmitButton.addActionListener(e -> {
            try{
                GID = Integer.parseInt(GroupDividendsIDEntry.getText());
                GroupDividendsNameEntry.setText(""+Group.GetGName(GID));
                float totalshares = Miscallenous.totalItems(Member.getAllShares(), Group.getGroupAllShares(), Group.getGroupIndividualAllShares());
                float totalinterest = Miscallenous.totalItems(Member.getAllInterests(), Group.getGroupAllInterests(), Group.getGroupIndividualAllInterests());
                float totalpenalty = Miscallenous.totalItems(Member.getAllPenalties(), Group.getGroupAllPenalties(), Group.getGroupIndividualAllPenalties());
                float income = Miscallenous.sumItems(totalinterest, totalpenalty);
                float dividends = Miscallenous.totatDividends(Group.GetGroupShares(GID), totalshares, income);
                GroupDividendsDividendsEntry.setText(""+dividends);
            }catch (Exception ex) {JOptionPane.showMessageDialog(frame,ex.getMessage());}
        });
        GroupIndividualPenaltyStatusSubmitButton.addActionListener(e -> {
            try{
                GID = Integer.parseInt(GroupIndividualDividendsIDEntry.getText());
                GroupIndividualDividendsFNameEntry.setText(""+Group.GetFname(GID));
                GroupIndividualDividendsFNameEntry.setText(""+Group.GetLname(GID));
                float totalshares = Miscallenous.totalItems(Member.getAllShares(), Group.getGroupAllShares(), Group.getGroupIndividualAllShares());
                float totalinterest = Miscallenous.totalItems(Member.getAllInterests(), Group.getGroupAllInterests(), Group.getGroupIndividualAllInterests());
                float totalpenalty = Miscallenous.totalItems(Member.getAllPenalties(), Group.getGroupAllPenalties(), Group.getGroupIndividualAllPenalties());
                float income = Miscallenous.sumItems(totalinterest, totalpenalty);
                float dividends = Miscallenous.totatDividends(Group.GetGroupIndividualShares(GID), totalshares, income);
                GroupIndividualDividendsDividendsEntry.setText(""+dividends);
            }catch (Exception ex) {JOptionPane.showMessageDialog(frame,ex.getMessage());}
        });

        mbr.add(NewRegistration);
        mbr.add(NewContribution);
        mbr.add(NewLoans);
        mbr.add(NewReports);

        frame.setJMenuBar(mbr);
        frame.setLayout(new BorderLayout());
        frame.add(contentpage, BorderLayout.WEST);
        frame.add(mainPanel, BorderLayout.CENTER);

        frame.setSize(900, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}