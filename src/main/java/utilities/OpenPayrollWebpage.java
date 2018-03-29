package utilities;


import frameworksupportmethods.GenericBaseClass;
import frameworksupportmethods.OpenMasterWebPage;

import java.io.IOException;

public class OpenPayrollWebpage extends GenericBaseClass {

    OpenMasterWebPage o1 = new OpenMasterWebPage ( );

    public void DefineAcademicYear ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Global_Master", "DefineSession", "DefineAcademicYear" );
        o1.newOpenMasterWebPage ( payroll_WebpageMenuPath, "Global_Master", "DefineSession", "DefineAcademicYear" );
    }

    public void Define_Financial_Year ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Global_Master", "DefineSession", "DefineFinancialYear" );
        o1.newOpenMasterWebPage ( payroll_WebpageMenuPath, "Global_Master", "DefineSession", "DefineFinancialYear" );
    }

    public void Define_Profession ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Global_Master", "DefineProfession", "DefineProfession" );
        o1.newOpenMasterWebPage ( payroll_WebpageMenuPath, "Global_Master", "DefineProfession", "DefineProfession" );
    }

    public void Define_Staff_Type ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Global_Master", "DefineStaffType", "DefineStaffType" );
        o1.newOpenMasterWebPage ( payroll_WebpageMenuPath, "Global_Master", "DefineStaffType", "DefineStaffType" );
    }

    public void Define_Designation ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Global_Master", "DefineDesignation", "DefineDesignation" );
        o1.newOpenMasterWebPage ( payroll_WebpageMenuPath, "Global_Master", "DefineDesignation", "DefineDesignation" );
    }

    public void Define_Department ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Global_Master", "DefineDepartment", "DefineDepartment" );
        o1.newOpenMasterWebPage ( payroll_WebpageMenuPath, "Global_Master", "DefineDepartment", "DefineDepartment" );
    }

    public void Define_Staff ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Global_Master", "DefineStaff", "DefineStaff" );
        o1.newOpenMasterWebPage ( payroll_WebpageMenuPath, "Global_Master", "DefineStaff", "DefineStaff" );
    }

    public void Modify_Staff_in_Bulk ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Global_Master", "ModifyStaffinBulk", "ModifyStaffinBulk" );
        o1.newOpenMasterWebPage ( payroll_WebpageMenuPath, "Global_Master", "ModifyStaffinBulk", "ModifyStaffinBulk" );
    }

    public void Rejoin_Staff ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Global_Master", "RejoinStaff", "RejoinStaff" );
        o1.newOpenMasterWebPage ( payroll_WebpageMenuPath, "Global_Master", "RejoinStaff", "RejoinStaff" );
    }

    public void Define_Reminder ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Global_Master", "DefineReminder", "DefineReminder" );
        o1.newOpenMasterWebPage ( payroll_WebpageMenuPath, "Global_Master", "DefineReminder", "DefineReminder" );
    }

    public void Assign_Transport_To_Staff ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Global_Master", "AssignTransportToStaff", "AssignTransportToStaff" );
        o1.newOpenMasterWebPage ( payroll_WebpageMenuPath, "Global_Master", "AssignTransportToStaff", "AssignTransportToStaff" );
    }

    public void Report_Setting ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Global_Master", "ReportSetting", "ReportSetting" );
        o1.newOpenMasterWebPage ( payroll_WebpageMenuPath, "Global_Master", "ReportSetting", "ReportSetting" );
    }

    public void Define_Global_Settings ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Master_Settings", "DefineGlobalSettings", "DefineGlobalSettings" );
        o1.newOpenMasterWebPage ( payroll_WebpageMenuPath, "Master_Settings", "DefineGlobalSettings", "DefineGlobalSettings" );
    }

    public void Change_Academic ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Master_Settings", "ChangeAcademic", "ChangeAcademic" );
        o1.newOpenMasterWebPage ( payroll_WebpageMenuPath, "Master_Settings", "ChangeAcademic", "ChangeAcademic" );
    }

    public void Report_Layout_Setting ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Master_Settings", "ReportLayoutSetting", "ReportLayoutSetting" );
        o1.newOpenMasterWebPage ( payroll_WebpageMenuPath, "Master_Settings", "ReportLayoutSetting", "ReportLayoutSetting" );
    }

    public void Session_Transfer ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Master_Settings", "SessionTransfer", "SessionTransfer" );
        o1.newOpenMasterWebPage ( payroll_WebpageMenuPath, "Master_Settings", "SessionTransfer", "SessionTransfer" );
    }

    public void Define_Salary_Account ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "DefineSalaryAccount", "DefineSalaryAccount" );
    }

    public void Define_Salary_Month ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "DefineSalaryMonth", "DefineSalaryMonth" );
    }

    public void Assign_Info_Bulk ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "AssignInfoBulk", "AssignInfoBulk" );
    }

    public void Define_Salary_Head ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "CreateSalaryStructure", "DefineSalaryHead" );
    }

    public void Relate__Dynamic_Heads ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "CreateSalaryStructure", "RelateStaticDynamicHeads" );
    }

    public void Define_Salary_Group ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "CreateSalaryStructure", "DefineSalaryGroup" );
    }

    public void Assign_Salary_Head_to_Group ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "CreateSalaryStructure", "AssignSalaryHeadtoGroup" );
    }

    public void Assign_Salary_Group_to_Staff ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "CreateSalaryStructure", "AssignSalaryGrouptoStaff" );
    }

    public void Bulk_Salary_Head_Assign ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "CreateSalaryStructure", "BulkSalaryHeadAssign" );
    }

    public void Bulk_Salary_Head_Entry ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "CreateSalaryStructure", "BulkSalaryHeadEntry" );
    }

    public void Bulk_Head_Remark_Entry ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "CreateSalaryStructure", "BulkHeadRemarkEntry" );
    }

    public void Define_Income_Tax_Slab ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "TDSConfiguration", "DefineIncomeTaxSlab" );
    }

    public void Define_IT_Head_Groups ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "TDSConfiguration", "DefineITHeadGroups" );
    }

    public void Define_IT_Head ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "TDSConfiguration", "DefineITHead" );
    }

    public void Define_TDS_Deductee ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "TDSConfiguration", "DefineTDSDeductee" );
    }

    public void Define_Pay_Scale ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "PayScaleConfiguration", "DefinePayScale" );
    }

    public void Define_Pay_Scale_Amount ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "PayScaleConfiguration", "DefinePayScaleAmount" );
    }

    public void Define_Grade_Pay ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "PayScaleConfiguration", "DefineGradePay" );
    }

    public void Define_Fixation ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "PayScaleConfiguration", "DefineFixation" );
    }

    public void Assign_Pay_Scale_to_Staff ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "PayScaleConfiguration", "AssignPayScaletoStaff" );
    }

    public void Generate_Barcode ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "GenerateBarcode", "GenerateBarcode" );
    }

    public void Insurance_Vendor ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "Insurance", "InsuranceVendor" );
    }

    public void Relate_policy_with_Employee ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "Insurance", "RelatepolicywithEmployee" );
    }

    public void Related_Policies_with_Month ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "Insurance", "RelatedPolicieswithMonth" );
    }

    public void Professional_Tax_slab ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "ProfessionalTaxSlab", "ProfessionalTaxSlab" );
    }

    public void Fix_Advance_A_c ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Advance", "FixAdvanceAc", "FixAdvanceAc" );
    }

    public void Advance_entry ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Advance", "Advanceentry", "Advanceentry" );
    }

    public void Advance_Repayment ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Advance", "AdvanceRepayment", "AdvanceRepayment" );
    }

    public void Advance_Entry_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Advance", "AdvanceReport", "AdvanceEntryReport" );
    }

    public void Advance_Repayment_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Advance", "AdvanceReport", "AdvanceRepaymentReport" );
    }

    public void Advance_Ledger_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Advance", "AdvanceReport", "AdvanceLedgerReport" );
    }

    public void Leave_LWP_Manual ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "LeaveLWPManual", "LeaveLWPManual" );
    }

    public void Occasional_Allowance_Deduction ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "OccasionalAllowanceDeduction",
                "OccasionalAllowanceDeduction" );
    }

    public void Salary_Generation ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "SalaryGeneration", "SalaryGeneration" );
    }

    public void Bank_Statement ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "BankStatement", "BankStatement" );
    }

    public void Insurance_Statement ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "InsuranceStatement", "InsuranceStatement" );
    }

    public void Due_Statement ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "DueStatement", "DueStatement" );
    }

    public void IT_Head_Entry ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "ITHeadEntry", "ITHeadEntry" );
    }

    public void TDS_Entry ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "TDSEntry", "TDSEntry" );
    }

    public void Gratuity_Calculations ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "GratuityCalculations", "GratuityCalculations" );
    }

    public void Bonus_Calculations ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "BonusCalculations", "BonusCalculations" );
    }

    public void Auto_Increment ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "Increment", "AutoIncrement" );
    }

    public void Increment_Rollback ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "Increment", "IncrementRollback" );
    }

    public void Staff_Salary_Structure ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "StaffSalaryStructure", "StaffSalaryStructure" );
    }

    public void Generate_Salary_Status ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "GenerateSalaryStatus", "GenerateSalaryStatus" );
    }

    public void Daily_Wages_Attendance ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "DailyWagesAttendance", "DailyWagesAttendance" );
    }

    public void Bank_Statement_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "BankStatementReport", "BankStatementReport" );
    }

    public void Salary_Sheet ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "SalarySheet", "SalarySheet" );
    }

    public void Salary_Slip ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "SalarySlip", "SalarySlip" );
    }

    public void Insurance_Statement_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "InsuranceStatementReport", "InsuranceStatementReport" );
    }

    public void TDS_Entry_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "IncomeTax", "TDSEntryReport" );
    }

    public void Quarterly_Form_24Q ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "IncomeTax", "QuarterlyForm24Q" );
    }

    public void TDS_24Q ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "IncomeTax", "TDS24Q" );
    }

    public void Gross_Form_16 ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "IncomeTax", "GrossForm16" );
    }

    public void Form_16 ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "IncomeTax", "Form16" );
    }

    public void Employee_Type_wise_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "EmployeeTypewiseReport", "EmployeeTypewiseReport" );
    }

    public void Estimated_Salary_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "EstimatedSalaryReport", "EstimatedSalaryReport" );
    }

    public void Department_wise_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "MonthlySalaryReports", "DepartmentwiseReport" );
    }

    public void Consolidated_Salary_Statement ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "MonthlySalaryReports", "ConsolidatedSalaryStatement" );
    }

    public void Gross_Salary_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "MonthlySalaryReports", "GrossSalaryReport" );
    }

    public void Month_Wise_Salary_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "MonthlySalaryReports", "MonthWiseSalaryReport" );
    }

    public void Monthly_Summary_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "MonthlySalaryReports", "MonthlySummaryReport" );
    }

    public void Head_Wise_Gross_Salary_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "MonthlySalaryReports", "HeadWiseGrossSalaryReport" );
    }

    public void Staff_Statement ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "MonthlySalaryReports", "StaffStatement" );
    }

    public void Reconciliation_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "YearlyReports", "ReconciliationReport" );
    }

    public void Annual_Salary_Paid_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "YearlyReports", "AnnualSalaryPaidReport" );
    }

    public void Salary_Statement_Employee_Wise ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "YearlyReports", "SalaryStatementEmployeeWise " );
    }

    public void Salary_Certificate_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "YearlyReports", "SalaryCertificateReport" );
    }

    public void Employee_Statistics ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Reports", "EmployeeStatistics", "EmployeeStatistics" );
    }

    public void ESI_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Reports", "ESIReport", "ESIReport" );
    }

    public void PF_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Reports", "PFReport", "PFReport" );
    }

    public void PF_Challan_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Reports", "PFChallanReport", "PFChallanReport" );
    }

    public void Increment_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Reports", "IncrementReport", "IncrementReport" );
    }

    public void GSLI_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Reports", "GSLIReport", "GSLIReport" );
    }

    public void Gratuity_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Reports", "GratuityReport", "GratuityReport" );
    }

    public void Salary_compare ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Reports", "Salarycompare", "Salarycompare" );
    }

    public void Professional_Tax ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Reports", "ProfessionalTax", "ProfessionalTax" );
    }

    public void Super_Annunciation_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Reports", "SuperAnnunciationReport", "SuperAnnunciationReport" );
    }

    public void MACP_List ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Reports", "MACPList", "MACPList" );
    }

    public void Fixation_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Reports", "FixationReport", "FixationReport" );
    }

    public void Date_Range_Retirement_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Reports", "DateRangeRetirementReport", "DateRangeRetirementReport" );
    }

    public void Retirement_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Reports", "RetirementReport", "RetirementReport" );
    }

    public void Pension_List ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Reports", "PensionList", "PensionList" );
    }

    public void Experience_Certificate_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Reports", "ExperienceCertificateReport", "ExperienceCertificateReport" );
    }

    public void Comparison_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Reports", "ComparisonReport", "ComparisonReport" );
    }

    public void Employee_Bio_Data ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Reports", "EmployeeBioData", "EmployeeBioData" );
    }

    public void Service_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Reports", "ServiceReport", "ServiceReport" );
    }

    public void PF_Statement ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Reports", "PFStatement", "PFStatement" );
    }

    public void PF_Annual_Report ( ) throws IOException, InterruptedException {
        o1.oldOpenMasterWebPage ( payroll_WebpageMenuPath, "Reports", "PFAnnualReport", "PFAnnualReport" );
    }


}


