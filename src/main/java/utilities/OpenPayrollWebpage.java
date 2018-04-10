package utilities;

import frameworksupportmethods.GenericBaseClass;
import frameworksupportmethods.OpenMasterWebPage;

public class OpenPayrollWebpage extends GenericBaseClass {

    OpenMasterWebPage o1 = new OpenMasterWebPage ( );

    public void DefineAcademicYear ( ) throws Exception {
        try {
            o1.openWebPage ( "Global_Master1", "DefineSession", payroll_WebpageMenuPath, "DefineAcademicYear" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Global_Master1", payroll_WebpageMenuPath, "DefineSession", "DefineAcademicYear" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Global_Master", "DefineSession", "DefineAcademicYear" );
            }
        }
    }

    public void Define_Financial_Year ( ) throws Exception {
        try {
            o1.openWebPage ( "Global_Master1", "DefineSession", payroll_WebpageMenuPath, "DefineFinancialYear" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Global_Master1", payroll_WebpageMenuPath, "DefineSession", "DefineFinancialYear" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Global_Master", "DefineSession", "DefineFinancialYear" );
            }
        }
    }

    public void Define_Profession ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Global_Master1", "DefineProfession" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Global_Master1", payroll_WebpageMenuPath, "DefineProfession", "DefineProfession" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Global_Master", "DefineProfession", "DefineProfession" );
            }
        }
    }

    public void Define_Staff_Type ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Global_Master1", "DefineStaffType" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Global_Master1", payroll_WebpageMenuPath, "DefineStaffType", "DefineStaffType" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Global_Master", "DefineStaffType", "DefineStaffType" );
            }
        }
    }

    public void Define_Designation ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Global_Master1", "DefineDesignation" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Global_Master1", payroll_WebpageMenuPath, "DefineDesignation", "DefineDesignation" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Global_Master", "DefineDesignation", "DefineDesignation" );
            }
        }
    }

    public void Define_Department ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Global_Master1", "DefineDepartment" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Global_Master1", payroll_WebpageMenuPath, "DefineDepartment", "DefineDepartment" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Global_Master", "DefineDepartment", "DefineDepartment" );
            }
        }
    }

    public void Define_Staff ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Global_Master1", "DefineStaff" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Global_Master1", payroll_WebpageMenuPath, "DefineStaff", "DefineStaff" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Global_Master", "DefineStaff", "DefineStaff" );
            }
        }
    }

    public void Modify_Staff_in_Bulk ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Global_Master1", "ModifyStaffinBulk" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Global_Master1", payroll_WebpageMenuPath, "ModifyStaffinBulk", "ModifyStaffinBulk" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Global_Master", "ModifyStaffinBulk", "ModifyStaffinBulk" );
            }
        }
    }

    public void Rejoin_Staff ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Global_Master1", "RejoinStaff" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Global_Master1", payroll_WebpageMenuPath, "RejoinStaff", "RejoinStaff" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Global_Master", "RejoinStaff", "RejoinStaff" );
            }
        }
    }

    public void Define_Reminder ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Global_Master1", "DefineReminder" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Global_Master1", payroll_WebpageMenuPath, "DefineReminder", "DefineReminder" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Global_Master", "DefineReminder", "DefineReminder" );
            }
        }
    }

    public void Assign_Transport_To_Staff ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Global_Master1", "AssignTransportToStaff" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Global_Master1", payroll_WebpageMenuPath, "AssignTransportToStaff", "AssignTransportToStaff" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Global_Master", "AssignTransportToStaff", "AssignTransportToStaff" );
            }
        }
    }

    public void Report_Setting ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Global_Master1", "ReportSetting" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Global_Master1", payroll_WebpageMenuPath, "ReportSetting", "ReportSetting" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Global_Master", "ReportSetting", "ReportSetting" );
            }
        }
    }

    public void Define_Global_Settings ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Master_Settings1", "DefineGlobalSettings" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Master_Settings1", payroll_WebpageMenuPath, "DefineGlobalSettings", "DefineGlobalSettings" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Master_Settings", "DefineGlobalSettings", "DefineGlobalSettings" );
            }
        }
    }

    public void Change_Academic ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Master_Settings1", "ChangeAcademic" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Master_Settings1", payroll_WebpageMenuPath, "ChangeAcademic", "ChangeAcademic" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Master_Settings", "ChangeAcademic", "ChangeAcademic" );
            }
        }
//
    }

    public void Report_Layout_Setting ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Master_Settings1", "ReportLayoutSetting" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Master_Settings1", payroll_WebpageMenuPath, "ReportLayoutSetting", "ReportLayoutSetting" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Master_Settings", "ReportLayoutSetting", "ReportLayoutSetting" );
            }
        }
    }

    public void Session_Transfer ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Master_Settings1", "SessionTransfer" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Master_Settings1", payroll_WebpageMenuPath, "SessionTransfer", "SessionTransfer" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Master_Settings", "SessionTransfer", "SessionTransfer" );
            }
        }
    }

    public void Define_Salary_Account ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master1", "DefineSalaryAccount" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Payroll_Master1", payroll_WebpageMenuPath, "DefineSalaryAccount", "DefineSalaryAccount" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "DefineSalaryAccount", "DefineSalaryAccount" );
            }
        }

    }

    public void Define_Salary_Month ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master1", "DefineSalaryMonth" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Payroll_Master1", payroll_WebpageMenuPath, "DefineSalaryMonth", "DefineSalaryMonth" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "DefineSalaryMonth", "DefineSalaryMonth" );
            }
        }
    }

    public void Assign_Info_Bulk ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master1", "AssignInfoBulk" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Payroll_Master1", payroll_WebpageMenuPath, "AssignInfoBulk", "AssignInfoBulk" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "AssignInfoBulk", "AssignInfoBulk" );
            }
        }
    }

    public void Define_Salary_Head ( ) throws Exception {
        try {
            o1.openWebPage ( "Payroll_Master1", "CreateSalaryStructure", payroll_WebpageMenuPath, "DefineSalaryHead" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Payroll_Master1", payroll_WebpageMenuPath, "CreateSalaryStructure", "DefineSalaryHead" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "CreateSalaryStructure", "DefineSalaryHead" );
            }
        }
    }

    public void Relate_Static_Dynamic_Heads ( ) throws Exception {
        try {
            o1.openWebPage ( "Payroll_Master1", "CreateSalaryStructure", payroll_WebpageMenuPath, "RelateStaticDynamicHeads" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Payroll_Master1", payroll_WebpageMenuPath, "CreateSalaryStructure", "RelateStaticDynamicHeads" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "CreateSalaryStructure", "RelateStaticDynamicHeads" );
            }
        }
    }

    public void Define_Salary_Group ( ) throws Exception {
        try {
            o1.openWebPage ( "Payroll_Master1", "CreateSalaryStructure", payroll_WebpageMenuPath, "DefineSalaryGroup" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Payroll_Master1", payroll_WebpageMenuPath, "CreateSalaryStructure", "DefineSalaryGroup" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "CreateSalaryStructure", "DefineSalaryGroup" );
            }
        }
    }

    public void Assign_Salary_Head_to_Group ( ) throws Exception {
        try {
            o1.openWebPage ( "Payroll_Master1", "CreateSalaryStructure", payroll_WebpageMenuPath, "AssignSalaryHeadtoGroup" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Payroll_Master1", payroll_WebpageMenuPath, "CreateSalaryStructure", "AssignSalaryHeadtoGroup" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "CreateSalaryStructure", "AssignSalaryHeadtoGroup" );
            }
        }
    }

    public void Assign_Salary_Group_to_Staff ( ) throws Exception {
        try {
            o1.openWebPage ( "Payroll_Master1", "CreateSalaryStructure", payroll_WebpageMenuPath, "AssignSalaryGrouptoStaff" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Payroll_Master1", payroll_WebpageMenuPath, "CreateSalaryStructure", "AssignSalaryGrouptoStaff" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "CreateSalaryStructure", "AssignSalaryGrouptoStaff" );
            }
        }
    }

    public void Bulk_Salary_Head_Assign ( ) throws Exception {
        try {
            o1.openWebPage ( "Payroll_Master1", "CreateSalaryStructure", payroll_WebpageMenuPath, "BulkSalaryHeadAssign" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Payroll_Master1", payroll_WebpageMenuPath, "CreateSalaryStructure", "BulkSalaryHeadAssign" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "CreateSalaryStructure", "BulkSalaryHeadAssign" );
            }
        }
    }

    public void Bulk_Salary_Head_Entry ( ) throws Exception {
        try {
            o1.openWebPage ( "Payroll_Master1", "CreateSalaryStructure", payroll_WebpageMenuPath, "BulkSalaryHeadEntry" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Payroll_Master1", payroll_WebpageMenuPath, "CreateSalaryStructure", "BulkSalaryHeadEntry" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "CreateSalaryStructure", "BulkSalaryHeadEntry" );
            }
        }
    }

    public void Bulk_Head_Remark_Entry ( ) throws Exception {
        try {
            o1.openWebPage ( "Payroll_Master1", "CreateSalaryStructure", payroll_WebpageMenuPath, "BulkHeadRemarkEntry" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Payroll_Master1", payroll_WebpageMenuPath, "CreateSalaryStructure", "BulkHeadRemarkEntry" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "CreateSalaryStructure", "BulkHeadRemarkEntry" );
            }
        }
    }

    public void Define_Income_Tax_Slab ( ) throws Exception {
        try {
            o1.openWebPage ( "Payroll_Master1", "TDSConfiguration", payroll_WebpageMenuPath, "DefineIncomeTaxSlab" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Payroll_Master1", payroll_WebpageMenuPath, "TDSConfiguration", "DefineIncomeTaxSlab" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "TDSConfiguration", "DefineIncomeTaxSlab" );
            }
        }
    }

    public void Define_IT_Head_Groups ( ) throws Exception {
        try {
            o1.openWebPage ( "Payroll_Master1", "TDSConfiguration", payroll_WebpageMenuPath, "DefineITHeadGroups" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Payroll_Master1", payroll_WebpageMenuPath, "TDSConfiguration", "DefineITHeadGroups" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "TDSConfiguration", "DefineITHeadGroups" );
            }
        }
    }

    public void Define_IT_Head ( ) throws Exception {
        try {
            o1.openWebPage ( "Payroll_Master1", "TDSConfiguration", payroll_WebpageMenuPath, "DefineITHead" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Payroll_Master1", payroll_WebpageMenuPath, "TDSConfiguration", "DefineITHead" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "TDSConfiguration", "DefineITHead" );
            }
        }
    }

    public void Define_TDS_Deductee ( ) throws Exception {
        try {
            o1.openWebPage ( "Payroll_Master1", "TDSConfiguration", payroll_WebpageMenuPath, "DefineTDSDeductee" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Payroll_Master1", payroll_WebpageMenuPath, "TDSConfiguration", "DefineTDSDeductee" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "TDSConfiguration", "DefineTDSDeductee" );
            }
        }
    }

    public void Define_Pay_Scale ( ) throws Exception {
        try {
            o1.openWebPage ( "Payroll_Master1", "PayScaleConfiguration", payroll_WebpageMenuPath, "DefinePayScale" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Payroll_Master1", payroll_WebpageMenuPath, "PayScaleConfiguration", "DefinePayScale" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "PayScaleConfiguration", "DefinePayScale" );
            }
        }
    }

    public void Define_Pay_Scale_Amount ( ) throws Exception {
        try {
            o1.openWebPage ( "Payroll_Master", "PayScaleConfiguration", payroll_WebpageMenuPath, "DefinePayScaleAmount" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Payroll_Master", payroll_WebpageMenuPath, "PayScaleConfiguration", "DefinePayScaleAmount" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "PayScaleConfiguration", "DefinePayScaleAmount" );
            }
        }
    }

    public void Define_Grade_Pay ( ) throws Exception {
        try {
            o1.openWebPage ( "Payroll_Master1", "PayScaleConfiguration", payroll_WebpageMenuPath, "DefineGradePay" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Payroll_Master1", payroll_WebpageMenuPath, "PayScaleConfiguration", "DefineGradePay" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "PayScaleConfiguration", "DefineGradePay" );
            }
        }
    }

    public void Define_Fixation ( ) throws Exception {
        try {
            o1.openWebPage ( "Payroll_Master1", "PayScaleConfiguration", payroll_WebpageMenuPath, "DefineFixation" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Payroll_Master1", payroll_WebpageMenuPath, "PayScaleConfiguration", "DefineFixation" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "PayScaleConfiguration", "DefineFixation" );
            }
        }
    }

    public void Assign_Pay_Scale_to_Staff ( ) throws Exception {
        try {
            o1.openWebPage ( "Payroll_Master1", "PayScaleConfiguration", payroll_WebpageMenuPath, "AssignPayScaletoStaff" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Payroll_Master1", payroll_WebpageMenuPath, "PayScaleConfiguration", "AssignPayScaletoStaff" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "PayScaleConfiguration", "AssignPayScaletoStaff" );
            }
        }
    }

    public void Generate_Barcode ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master1", "GenerateBarcode" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Payroll_Master1", payroll_WebpageMenuPath, "GenerateBarcode", "GenerateBarcode" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "GenerateBarcode", "GenerateBarcode" );
            }
        }
    }

    public void Insurance_Vendor ( ) throws Exception {
        try {
            o1.openWebPage ( "Payroll_Master1", "Insurance", payroll_WebpageMenuPath, "InsuranceVendor" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Payroll_Master1", payroll_WebpageMenuPath, "Insurance", "InsuranceVendor" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "Insurance", "InsuranceVendor" );
            }
        }
    }

    public void Relate_policy_with_Employee ( ) throws Exception {
        try {
            o1.openWebPage ( "Payroll_Master1", "Insurance", payroll_WebpageMenuPath, "RelatepolicywithEmployee" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Payroll_Master1", payroll_WebpageMenuPath, "Insurance", "RelatepolicywithEmployee" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "Insurance", "RelatepolicywithEmployee" );
            }
        }
    }

    public void Related_Policies_with_Month ( ) throws Exception {
        try {
            o1.openWebPage ( "Payroll_Master1", "Insurance", payroll_WebpageMenuPath, "RelatedPolicieswithMonth" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Payroll_Master1", payroll_WebpageMenuPath, "Insurance", "RelatedPolicieswithMonth" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "Insurance", "RelatedPolicieswithMonth" );
            }
        }
    }

    public void Professional_Tax_slab ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "ProfessionalTaxSlab" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Payroll_Master", payroll_WebpageMenuPath, "ProfessionalTaxSlab", "ProfessionalTaxSlab" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Payroll_Master", "ProfessionalTaxSlab", "ProfessionalTaxSlab" );
            }
        }
    }

    public void Fix_Advance_A_c ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Advance1", "FixAdvanceAc" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Advance1", payroll_WebpageMenuPath, "FixAdvanceAc", "FixAdvanceAc" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Advance", "FixAdvanceAc", "FixAdvanceAc" );
            }
        }
    }

    public void Advance_entry ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Advance1", "Advanceentry" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Advance1", payroll_WebpageMenuPath, "Advanceentry", "Advanceentry" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Advance", "Advanceentry", "Advanceentry" );
            }
        }
    }

    public void Advance_Repayment ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Advance1", "AdvanceRepayment" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Advance1", payroll_WebpageMenuPath, "AdvanceRepayment", "AdvanceRepayment" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Advance", "AdvanceRepayment", "AdvanceRepayment" );
            }
        }
    }

    public void Advance_Entry_Report ( ) throws Exception {
        try {
            o1.openWebPage ( "Advance1", "AdvanceReport", payroll_WebpageMenuPath, "AdvanceEntryReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Advance1", payroll_WebpageMenuPath, "AdvanceReport", "AdvanceEntryReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Advance", "AdvanceReport", "AdvanceEntryReport" );
            }
        }
    }

    public void Advance_Repayment_Report ( ) throws Exception {
        try {
            o1.openWebPage ( "Advance1", "AdvanceReport", payroll_WebpageMenuPath, "AdvanceRepaymentReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Advance1", payroll_WebpageMenuPath, "AdvanceReport", "AdvanceRepaymentReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Advance", "AdvanceReport", "AdvanceRepaymentReport" );
            }
        }
    }

    public void Advance_Ledger_Report ( ) throws Exception {
        try {
            o1.openWebPage ( "Advance1", "AdvanceReport", payroll_WebpageMenuPath, "AdvanceLedgerReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Advance1", payroll_WebpageMenuPath, "AdvanceReport", "AdvanceLedgerReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Advance", "AdvanceReport", "AdvanceLedgerReport" );
            }
        }
    }

    public void Leave_LWP_Manual ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Structure1", "LeaveLWPManual" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Structure1", payroll_WebpageMenuPath, "LeaveLWPManual", "LeaveLWPManual" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "LeaveLWPManual", "LeaveLWPManual" );
            }
        }
    }

    public void Occasional_Allowance_Deduction ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Structure1", "OccasionalAllowanceDeduction" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Structure1", payroll_WebpageMenuPath, "OccasionalAllowanceDeduction", "OccasionalAllowanceDeduction" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "OccasionalAllowanceDeduction", "OccasionalAllowanceDeduction" );
            }
        }
    }

    public void Salary_Generation ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Structure1", "SalaryGeneration" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Structure1", payroll_WebpageMenuPath, "SalaryGeneration", "SalaryGeneration" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "SalaryGeneration", "SalaryGeneration" );
            }
        }
    }

    public void Bank_Statement ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Structure1", "BankStatement" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Structure1", payroll_WebpageMenuPath, "BankStatement", "BankStatement" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "BankStatement", "BankStatement" );
            }
        }
    }

    public void Insurance_Statement ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Structure1", "InsuranceStatement" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Structure1", payroll_WebpageMenuPath, "InsuranceStatement", "InsuranceStatement" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "InsuranceStatement", "InsuranceStatement" );
            }
        }
    }

    public void Due_Statement ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Structure1", "DueStatement" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Structure1", payroll_WebpageMenuPath, "DueStatement", "DueStatement" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "DueStatement", "DueStatement" );
            }
        }
    }

    public void IT_Head_Entry ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Structure1", "ITHeadEntry" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Structure1", payroll_WebpageMenuPath, "ITHeadEntry", "ITHeadEntry" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "ITHeadEntry", "ITHeadEntry" );
            }
        }
    }

    public void TDS_Entry ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Structure1", "TDSEntry" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Structure1", payroll_WebpageMenuPath, "TDSEntry", "TDSEntry" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "TDSEntry", "TDSEntry" );
            }
        }
    }

    public void Gratuity_Calculations ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Structure1", "GratuityCalculations" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Structure1", payroll_WebpageMenuPath, "GratuityCalculations", "GratuityCalculations" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "GratuityCalculations", "GratuityCalculations" );
            }
        }
    }

    public void Bonus_Calculations ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Structure1", "BonusCalculations" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Structure1", payroll_WebpageMenuPath, "BonusCalculations", "BonusCalculations" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "BonusCalculations", "BonusCalculations" );
            }
        }
    }

    public void Auto_Increment ( ) throws Exception {
        try {
            o1.openWebPage ( "Salary_Structure1", "Increment", payroll_WebpageMenuPath, "AutoIncrement" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Structure1", payroll_WebpageMenuPath, "Increment", "AutoIncrement" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "Increment", "AutoIncrement" );
            }
        }
    }

    public void Increment_Rollback ( ) throws Exception {
        try {
            o1.openWebPage ( "Salary_Structure1", "Increment", payroll_WebpageMenuPath, "IncrementRollback" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Structure1", payroll_WebpageMenuPath, "Increment", "IncrementRollback" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "Increment", "IncrementRollback" );
            }
        }
    }

    public void Staff_Salary_Structure ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Structure1", "StaffSalaryStructure" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Structure1", payroll_WebpageMenuPath, "StaffSalaryStructure", "StaffSalaryStructure" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "StaffSalaryStructure", "StaffSalaryStructure" );
            }
        }
    }

    public void Generate_Salary_Status ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Structure1", "GenerateSalaryStatus" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Structure1", payroll_WebpageMenuPath, "GenerateSalaryStatus", "GenerateSalaryStatus" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "GenerateSalaryStatus", "GenerateSalaryStatus" );
            }
        }
    }

    public void Daily_Wages_Attendance ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Structure1", "DailyWagesAttendance" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Structure1", payroll_WebpageMenuPath, "DailyWagesAttendance", "DailyWagesAttendance" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Structure", "DailyWagesAttendance", "DailyWagesAttendance" );
            }
        }
    }

    public void Bank_Statement_Report ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Reports1", "BankStatementReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Reports1", payroll_WebpageMenuPath, "BankStatementReport", "BankStatementReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "BankStatementReport", "BankStatementReport" );
            }
        }
    }

    public void Salary_Sheet ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Reports1", "SalarySheet" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Reports1", payroll_WebpageMenuPath, "SalarySheet", "SalarySheet" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "SalarySheet", "SalarySheet" );
            }
        }
    }

    public void Salary_Slip ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Reports1", "SalarySlip" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Reports1", payroll_WebpageMenuPath, "SalarySlip", "SalarySlip" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "SalarySlip", "SalarySlip" );
            }
        }
    }

    public void Insurance_Statement_Report ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Reports1", "InsuranceStatementReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Reports1", payroll_WebpageMenuPath, "InsuranceStatementReport", "InsuranceStatementReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "InsuranceStatementReport", "InsuranceStatementReport" );
            }
        }
    }

    public void TDS_Entry_Report ( ) throws Exception {
        try {
            o1.openWebPage ( "Salary_Reports1", "IncomeTax", payroll_WebpageMenuPath, "TDSEntryReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Reports1", payroll_WebpageMenuPath, "IncomeTax", "TDSEntryReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "IncomeTax", "TDSEntryReport" );
            }
        }
    }

    public void Quarterly_Form_24Q ( ) throws Exception {
        try {
            o1.openWebPage ( "Salary_Reports1", "IncomeTax", payroll_WebpageMenuPath, "QuarterlyForm24Q" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Reports1", payroll_WebpageMenuPath, "IncomeTax", "QuarterlyForm24Q" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "IncomeTax", "QuarterlyForm24Q" );
            }
        }
    }

    public void TDS_24Q ( ) throws Exception {
        try {
            o1.openWebPage ( "Salary_Reports1", "IncomeTax", payroll_WebpageMenuPath, "TDS24Q" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Reports1", payroll_WebpageMenuPath, "IncomeTax", "TDS24Q" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "IncomeTax", "TDS24Q" );
            }
        }
    }

    public void Gross_Form_16 ( ) throws Exception {
        try {
            o1.openWebPage ( "Salary_Reports1", "IncomeTax", payroll_WebpageMenuPath, "GrossForm16" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Reports1", payroll_WebpageMenuPath, "IncomeTax", "GrossForm16" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "IncomeTax", "GrossForm16" );
            }
        }
    }

    public void Form_16 ( ) throws Exception {
        try {
            o1.openWebPage ( "Salary_Reports1", "IncomeTax", payroll_WebpageMenuPath, "Form16" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Reports1", payroll_WebpageMenuPath, "IncomeTax", "Form16" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "IncomeTax", "Form16" );
            }
        }
    }

    public void Employee_Type_wise_Report ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Reports1", "EmployeeTypewiseReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Reports1", payroll_WebpageMenuPath, "EmployeeTypewiseReport", "EmployeeTypewiseReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "EmployeeTypewiseReport", "EmployeeTypewiseReport" );
            }
        }
    }

    public void Estimated_Salary_Report ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Reports1", "EstimatedSalaryReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Reports1", payroll_WebpageMenuPath, "EstimatedSalaryReport", "EstimatedSalaryReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "EstimatedSalaryReport", "EstimatedSalaryReport" );
            }
        }
    }

    public void Department_wise_Report ( ) throws Exception {
        try {
            o1.openWebPage ( "Salary_Reports1", "MonthlySalaryReports", payroll_WebpageMenuPath, "DepartmentwiseReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Reports1", payroll_WebpageMenuPath, "MonthlySalaryReports", "DepartmentwiseReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "MonthlySalaryReports", "DepartmentwiseReport" );
            }
        }
    }

    public void Consolidated_Salary_Statement ( ) throws Exception {
        try {
            o1.openWebPage ( "Salary_Reports1", "MonthlySalaryReports", payroll_WebpageMenuPath, "ConsolidatedSalaryStatement" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Reports1", payroll_WebpageMenuPath, "MonthlySalaryReports", "ConsolidatedSalaryStatement" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "MonthlySalaryReports", "ConsolidatedSalaryStatement" );
            }
        }
    }

    public void Gross_Salary_Report ( ) throws Exception {
        try {
            o1.openWebPage ( "Salary_Reports1", "MonthlySalaryReports", payroll_WebpageMenuPath, "GrossSalaryReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Reports1", payroll_WebpageMenuPath, "MonthlySalaryReports", "GrossSalaryReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "MonthlySalaryReports", "GrossSalaryReport" );
            }
        }
    }

    public void Month_Wise_Salary_Report ( ) throws Exception {
        try {
            o1.openWebPage ( "Salary_Reports1", "MonthlySalaryReports", payroll_WebpageMenuPath, "MonthWiseSalaryReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Reports1", payroll_WebpageMenuPath, "MonthlySalaryReports", "MonthWiseSalaryReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "MonthlySalaryReports", "MonthWiseSalaryReport" );
            }
        }
    }

    public void Monthly_Summary_Report ( ) throws Exception {
        try {
            o1.openWebPage ( "Salary_Reports1", "MonthlySalaryReports", payroll_WebpageMenuPath, "MonthlySummaryReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Reports1", payroll_WebpageMenuPath, "MonthlySalaryReports", "MonthlySummaryReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "MonthlySalaryReports", "MonthlySummaryReport" );
            }
        }
    }

    public void Head_Wise_Gross_Salary_Report ( ) throws Exception {
        try {
            o1.openWebPage ( "Salary_Reports1", "MonthlySalaryReports", payroll_WebpageMenuPath, "HeadWiseGrossSalaryReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Reports1", payroll_WebpageMenuPath, "MonthlySalaryReports", "HeadWiseGrossSalaryReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "MonthlySalaryReports", "HeadWiseGrossSalaryReport" );
            }
        }
    }

    public void Staff_Statement ( ) throws Exception {
        try {
            o1.openWebPage ( "Salary_Reports1", "MonthlySalaryReports", payroll_WebpageMenuPath, "StaffStatement" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Reports1", payroll_WebpageMenuPath, "MonthlySalaryReports", "StaffStatement" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "MonthlySalaryReports", "StaffStatement" );
            }
        }
    }

    public void Reconciliation_Report ( ) throws Exception {
        try {
            o1.openWebPage ( "Salary_Reports1", "YearlyReports", payroll_WebpageMenuPath, "ReconciliationReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Reports1", payroll_WebpageMenuPath, "YearlyReports", "ReconciliationReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "YearlyReports", "ReconciliationReport" );
            }
        }
    }

    public void Annual_Salary_Paid_Report ( ) throws Exception {
        try {
            o1.openWebPage ( "Salary_Reports1", "YearlyReports", payroll_WebpageMenuPath, "AnnualSalaryPaidReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Reports1", payroll_WebpageMenuPath, "YearlyReports", "AnnualSalaryPaidReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "YearlyReports", "AnnualSalaryPaidReport" );
            }
        }
    }

    public void Salary_Statement_Employee_Wise ( ) throws Exception {
        try {
            o1.openWebPage ( "Salary_Reports1", "YearlyReports", payroll_WebpageMenuPath, "SalaryStatementEmployeeWise" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Reports1", payroll_WebpageMenuPath, "YearlyReports", "SalaryStatementEmployeeWise" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "YearlyReports", "SalaryStatementEmployeeWise" );
            }
        }
    }

    public void Salary_Certificate_Report ( ) throws Exception {
        try {
            o1.openWebPage ( "Salary_Reports1", "YearlyReports", payroll_WebpageMenuPath, "SalaryCertificateReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Salary_Reports1", payroll_WebpageMenuPath, "YearlyReports", "SalaryCertificateReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Salary_Reports", "YearlyReports", "SalaryCertificateReport" );
            }
        }
    }

    public void Employee_Statistics ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Reports1", "EmployeeStatistics" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Reports1", payroll_WebpageMenuPath, "EmployeeStatistics", "EmployeeStatistics" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Reports", "EmployeeStatistics", "EmployeeStatistics" );
            }
        }
    }

    public void ESI_Report ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Reports1", "ESIReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Reports1", payroll_WebpageMenuPath, "ESIReport", "ESIReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Reports", "ESIReport", "ESIReport" );
            }
        }
    }

    public void PF_Report ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Reports1", "PFReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Reports1", payroll_WebpageMenuPath, "PFReport", "PFReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Reports", "PFReport", "PFReport" );
            }
        }
    }

    public void PF_Challan_Report ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Reports1", "PFChallanReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Reports1", payroll_WebpageMenuPath, "PFChallanReport", "PFChallanReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Reports", "PFChallanReport", "PFChallanReport" );
            }
        }
    }

    public void Increment_Report ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Reports1", "IncrementReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Reports1", payroll_WebpageMenuPath, "IncrementReport", "IncrementReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Reports", "IncrementReport", "IncrementReport" );
            }
        }
    }

    public void GSLI_Report ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Reports1", "GSLIReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Reports1", payroll_WebpageMenuPath, "GSLIReport", "GSLIReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Reports", "GSLIReport", "GSLIReport" );
            }
        }
    }

    public void Gratuity_Report ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Reports1", "GratuityReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Reports1", payroll_WebpageMenuPath, "GratuityReport", "GratuityReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Reports", "GratuityReport", "GratuityReport" );
            }
        }
    }

    public void Salary_compare ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Reports1", "Salarycompare" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Reports1", payroll_WebpageMenuPath, "Salarycompare", "Salarycompare" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Reports", "Salarycompare", "Salarycompare" );
            }
        }
    }

    public void Professional_Tax ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Reports1", "ProfessionalTax" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Reports1", payroll_WebpageMenuPath, "ProfessionalTax", "ProfessionalTax" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Reports", "ProfessionalTax", "ProfessionalTax" );
            }
        }
    }

    public void Super_Annunciation_Report ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Reports1", "SuperAnnunciationReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Reports1", payroll_WebpageMenuPath, "SuperAnnunciationReport", "SuperAnnunciationReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Reports", "SuperAnnunciationReport", "SuperAnnunciationReport" );
            }
        }
    }

    public void MACP_List ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Reports1", "MACPList" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Reports1", payroll_WebpageMenuPath, "MACPList", "MACPList" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Reports", "MACPList", "MACPList" );
            }
        }
    }

    public void Fixation_Report ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Reports1", "FixationReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Reports1", payroll_WebpageMenuPath, "FixationReport", "FixationReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Reports", "FixationReport", "FixationReport" );
            }
        }
    }

    public void Date_Range_Retirement_Report ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Reports1", "DateRangeRetirementReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Reports1", payroll_WebpageMenuPath, "DateRangeRetirementReport", "DateRangeRetirementReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Reports", "DateRangeRetirementReport", "DateRangeRetirementReport" );
            }
        }
    }

    public void Retirement_Report ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Reports1", "RetirementReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Reports1", payroll_WebpageMenuPath, "RetirementReport", "RetirementReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Reports", "RetirementReport", "RetirementReport" );
            }
        }
    }

    public void Pension_List ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Reports1", "PensionList" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Reports1", payroll_WebpageMenuPath, "PensionList", "PensionList" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Reports", "PensionList", "PensionList" );
            }
        }
    }

    public void Experience_Certificate_Report ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Reports1", "ExperienceCertificateReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Reports1", payroll_WebpageMenuPath, "ExperienceCertificateReport", "ExperienceCertificateReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Reports", "ExperienceCertificateReport", "ExperienceCertificateReport" );
            }
        }
    }

    public void Comparison_Report ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Reports1", "ComparisonReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Reports1", payroll_WebpageMenuPath, "ComparisonReport", "ComparisonReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Reports", "ComparisonReport", "ComparisonReport" );
            }
        }
    }

    public void Employee_Bio_Data ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Reports1", "EmployeeBioData" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Reports1", payroll_WebpageMenuPath, "EmployeeBioData", "EmployeeBioData" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Reports", "EmployeeBioData", "EmployeeBioData" );
            }
        }
    }

    public void Service_Report ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Reports1", "ServiceReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Reports1", payroll_WebpageMenuPath, "ServiceReport", "ServiceReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Reports", "ServiceReport", "ServiceReport" );
            }
        }
    }

    public void PF_Statement ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Reports1", "PFStatement" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Reports1", payroll_WebpageMenuPath, "PFStatement", "PFStatement" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Reports", "PFStatement", "PFStatement" );
            }
        }
    }

    public void PF_Annual_Report ( ) throws Exception {
        try {
            o1.openWebPage ( payroll_WebpageMenuPath, "Reports1", "PFAnnualReport" );
        } catch (Exception e) {
            try {
                o1.openWebPage ( "Reports1", payroll_WebpageMenuPath, "PFAnnualReport", "PFAnnualReport" );
            } catch (InterruptedException e1) {
                o1.openWebPage ( payroll_WebpageMenuPath, "Reports", "PFAnnualReport", "PFAnnualReport" );
            }
        }
    }
}