package com.astix.Common;

import android.net.Uri;

import java.io.File;

public class CommonInfo
{

	// Its for Live Path on 194 Server

  /*  public static int flgAllRoutesData=1;
	public static File imageF_savedInstance=null;
	public static String imageName_savedInstance=null;
	public static String clickedTagPhoto_savedInstance=null;
	public static Uri uriSavedImage_savedInstance=null;

	public static String imei="";
	public static String SalesQuoteId="BLANK";
	public static String quatationFlag="";
	public static String fileContent="";
	public static String prcID="NULL";

	public static String newQuottionID="NULL";
	public static String globalValueOfPaymentStage="0"+"_"+"0"+"_"+"0";

	public static String WebServicePath="http://103.20.212.194/WebServiceAndroidRSPLLive/Service.asmx";
	public static String VersionDownloadPath="http://103.20.212.194/downloads/";
	public static String VersionDownloadAPKName="RMMSFA.apk";

	public static String DATABASE_NAME = "DbRMMSFAApp";
	public static int AnyVisit = 0;

	public static int DATABASE_VERSIONID = 45;      // put this field value based on value in table on the server
	public static String AppVersionID = "1.11";      // put this field value based on value in table on the server
	public static int Application_TypeID = 2;       //1=Parag Store Mapping,2=Parag SFA Indirect,3=Parag SFA Direct

	public static String OrderSyncPath="http://103.20.212.194/ReadXML_RSPLLive/DefaultSFA.aspx";
	public static String ImageSyncPath="http://103.20.212.194/ReadXML_RSPLImagesLive/Default.aspx";

	public static String OrderTextSyncPath="http://103.20.212.194/ReadTxtFileForRSPLSFALive/default.aspx";

	public static String InvoiceSyncPath="http://103.20.212.194/ReadXML_RSPLInvoiceLive/Default.aspx";

	public static String DistributorSyncPath="http://103.20.212.194/ReadXML_RSPLSFADistributionLive/Default.aspx";

	// Distributor Map not use in RSPL so we r using this path so that exist code do not show error
	public static String OrderSyncPathDistributorMap="http://103.20.212.194/ReadXML_RSPLLive/DefaultSODistributorMapping.aspx";

	public static String OrderXMLFolder="RMMSFAXml";
	public static String ImagesFolder="RMMSFAImages";
	public static String TextFileFolder="RMMTextFile";
	public static String InvoiceXMLFolder="RMMInvoiceXml";
	public static String FinalLatLngJsonFile="RMMSFAFinalLatLngJson";

	public static String AppLatLngJsonFile="RMMSFALatLngJson";
	public static int DistanceRange=3000;
	public static String SalesPersonTodaysTargetMsg="";
	public static final String Preference="RMMPrefrence";
	public static final String AttandancePreference="RMMAttandancePreference";
	public static final String DistributorXMLFolder="RMMDistributorXMLFolder";
	public static final String DistributorMapXMLFolder="RMMDistributorMapXML";
	public static final String DistributorStockXMLFolder="RMMDistributorStockXML";
	public static final String DistributorCheckInXMLFolder="RMMDistributorCheckInXML";

	public static int CoverageAreaNodeID=0;
	public static int CoverageAreaNodeType=0;
	public static int SalesmanNodeId=0;
	public static int SalesmanNodeType=0;
	public static int flgDataScope=0;
	public static int FlgDSRSO=0;
	public static int DayStartClick=0;
	public static String ImagesFolderServer="RMMSFAImagesServer";
*/

	// Its for Test Path on 194 Server

/*
    public static int flgAllRoutesData=1;
	public static File imageF_savedInstance=null;
	public static String imageName_savedInstance=null;
	public static String clickedTagPhoto_savedInstance=null;
	public static Uri uriSavedImage_savedInstance=null;

	public static String imei="";
	public static String SalesQuoteId="BLANK";
	public static String quatationFlag="";
	public static String fileContent="";
	public static String prcID="NULL";

	public static String newQuottionID="NULL";
	public static String globalValueOfPaymentStage="0"+"_"+"0"+"_"+"0";


	public static String WebServicePath="http://103.20.212.194/WebServiceAndroidRSPLTest/Service.asmx";
	public static String VersionDownloadPath="http://103.20.212.194/downloads/";
	public static String VersionDownloadAPKName="RMMSFATest.apk";

	public static String DATABASE_NAME = "DbRMMSFAApp";
	public static int AnyVisit = 0;

	public static int DATABASE_VERSIONID = 53;      // put this field value based on value in table on the server
	public static String AppVersionID = "1.17";   // put this field value based on value in table on the server
	public static int Application_TypeID = 2; //1=Parag Store Mapping,2=Parag SFA Indirect,3=Parag SFA Direct

	public static String OrderSyncPath="http://103.20.212.194/ReadXML_RSPLTest/DefaultSFA.aspx";
	public static String ImageSyncPath="http://103.20.212.194/ReadXML_RSPLImagesTest/Default.aspx";
	public static String OrderSyncPathDistributorMap="http://103.20.212.194/ReadXML_RSPLTest/DefaultSODistributorMapping.aspx";

	public static String OrderTextSyncPath="http://103.20.212.194/ReadTxtFileForRSPLSFATest/default.aspx";
	public static String InvoiceSyncPath="http://103.20.212.194/ReadXML_RSPLInvoiceTest/Default.aspx";

	public static String DistributorSyncPath="http://103.20.212.194/ReadXML_RSPLSFADistributionTest/Default.aspx";
	public static String OrderXMLFolder="RMMSFAXml";
	public static String ImagesFolder="RMMSFAImages";
	public static String TextFileFolder="RMMTextFile";
	public static String InvoiceXMLFolder="RMMInvoiceXml";
	public static String FinalLatLngJsonFile="RMMSFAFinalLatLngJson";

	public static String AppLatLngJsonFile="RMMSFALatLngJson";

	public static int DistanceRange=3000;
	public static String SalesPersonTodaysTargetMsg="";
	public static final String Preference="RMMPrefrence";
	public static final String AttandancePreference="RMMAttandancePreference";
	public static final String DistributorXMLFolder="RMMDistributorXMLFolder";
	public static final String DistributorMapXMLFolder="RMMDistributorMapXML";
	public static final String DistributorStockXMLFolder="RMMDistributorStockXML";
	public static final String DistributorCheckInXMLFolder="RMMDistributorCheckInXML";

	public static int CoverageAreaNodeID=0;
	public static int CoverageAreaNodeType=0;
	public static int SalesmanNodeId=0;
	public static int SalesmanNodeType=0;
	public static int flgDataScope=0;
	public static int FlgDSRSO=0;
	public static int DayStartClick=0;
	  public static String ImagesFolderServer="RMMSFAImagesServer";
*/

	// Its for Dev Path on 194 Server


	   public static int flgAllRoutesData=1;
	    public static File imageF_savedInstance=null;
	    public static String imageName_savedInstance=null;
	    public static String clickedTagPhoto_savedInstance=null;
	    public static Uri uriSavedImage_savedInstance=null;

	    public static String imei="";
	    public static String SalesQuoteId="BLANK";
	    public static String quatationFlag="";
	    public static String fileContent="";
	    public static String prcID="NULL";

	    public static String newQuottionID="NULL";
	    public static String globalValueOfPaymentStage="0"+"_"+"0"+"_"+"0";



	    public static String WebServicePath="http://103.20.212.194/WebServiceAndroidRMMDev/Service.asmx";
	    public static String VersionDownloadPath="http://103.20.212.194/downloads/";
		public static String VersionDownloadAPKName="RMMSFADemo.apk";

		public static String DATABASE_NAME = "DbRMMSFAApp";

		public static int AnyVisit = 0;

		public static int DATABASE_VERSIONID = 45;      // put this field value based on value in table on the server
		public static String AppVersionID = "1.11";   // put this field value based on value in table on the server
		public static int Application_TypeID = 2; //1=Parag Store Mapping,2=Parag SFA Indirect,3=Parag SFA Direct

	    public static String OrderSyncPath="http://103.20.212.194/ReadXML_RMMDev/DefaultSFA.aspx";
	    public static String ImageSyncPath="http://103.20.212.194/ReadXML_RMMImagesDev/Default.aspx";

	    public static String OrderTextSyncPath="http://103.20.212.194/ReadTxtFileForRMMSFADev/default.aspx";
	    public static String OrderSyncPathDistributorMap="http://103.20.212.194/ReadXML_RMMDev/DefaultSODistributorMapping.aspx";

	    public static String InvoiceSyncPath="http://103.20.212.194/ReadXML_RMMLInvoiceDev/Default.aspx";

	    public static String DistributorSyncPath="http://103.20.212.194/ReadXML_RMMSFADistributionDev/Default.aspx";

		public static String OrderXMLFolder="RMMSFAXml";
		public static String ImagesFolder="RMMSFAImages";
	    public static String TextFileFolder="RMMTextFile";
	    public static String InvoiceXMLFolder="RMMInvoiceXml";
		public static String FinalLatLngJsonFile="RMMSFAFinalLatLngJson";

	    public static final String DistributorMapXMLFolder="RMMDistributorMapXML";
	    public static final String DistributorStockXMLFolder="RMMDistributorStockXML";
	    public static final String DistributorCheckInXMLFolder="RMMDistributorCheckInXML";

		public static String AppLatLngJsonFile="RMMSFALatLngJson";

		public static int DistanceRange=3000;
	    public static String SalesPersonTodaysTargetMsg="";
	    public static final String Preference="RMMPrefrence";
        public static final String AttandancePreference="RMMAttandancePreference";


        public static int CoverageAreaNodeID=0;
        public static int CoverageAreaNodeType=0;
        public static int SalesmanNodeId=0;
        public static int SalesmanNodeType=0;
        public static int flgDataScope=0;
        public static int FlgDSRSO=0;
        public static int DayStartClick=0;
	    public static String ImagesFolderServer="RMMSFAImagesServer";




// Its for Test Release on 194 Server



/*

	public static int flgAllRoutesData=1;
	public static File imageF_savedInstance=null;
	public static String imageName_savedInstance=null;
	public static String clickedTagPhoto_savedInstance=null;
	public static Uri uriSavedImage_savedInstance=null;

	public static String imei="";
	public static String SalesQuoteId="BLANK";
	public static String quatationFlag="";
	public static String fileContent="";
	public static String prcID="NULL";

	public static String newQuottionID="NULL";
	public static String globalValueOfPaymentStage="0"+"_"+"0"+"_"+"0";



	public static String WebServicePath="http://103.20.212.194/WebServiceAndroidRSPLTestRelease/Service.asmx";
	public static String VersionDownloadPath="http://103.20.212.194/downloads/";
	public static String VersionDownloadAPKName="RMMSFATestRelease.apk";

	public static String DATABASE_NAME = "DbRMMSFAApp";

	public static int AnyVisit = 0;

	public static int DATABASE_VERSIONID = 51;      // put this field value based on value in table on the server
	public static String AppVersionID = "1.13";   // put this field value based on value in table on the server
	public static int Application_TypeID = 2; //1=Parag Store Mapping,2=Parag SFA Indirect,3=Parag SFA Direct

	public static String OrderSyncPath="http://103.20.212.194/ReadXML_RSPLTestRelease/DefaultSFA.aspx";
	public static String ImageSyncPath="http://103.20.212.194/ReadXML_RSPLImagesTestRelease/Default.aspx";

	public static String OrderTextSyncPath="http://103.20.212.194/ReadTxtFileForRSPLSFATestRelease/default.aspx";
	public static String OrderSyncPathDistributorMap="http://103.20.212.194/ReadXML_RSPLTestRelease/DefaultSODistributorMapping.aspx";

	public static String InvoiceSyncPath="http://103.20.212.194/ReadXML_RSPLInvoiceTestRelease/Default.aspx";

	public static String DistributorSyncPath="http://103.20.212.194/ReadXML_RSPLSFADistributionTestRelease/Default.aspx";

	public static String OrderXMLFolder="RMMSFAXml";
	public static String ImagesFolder="RMMSFAImages";
	public static String TextFileFolder="RMMTextFile";
	public static String InvoiceXMLFolder="RMMInvoiceXml";
	public static String FinalLatLngJsonFile="RMMSFAFinalLatLngJson";

	public static final String DistributorMapXMLFolder="RMMDistributorMapXML";
	public static final String DistributorStockXMLFolder="RMMDistributorStockXML";
	public static final String DistributorCheckInXMLFolder="RMMDistributorCheckInXML";

	public static String AppLatLngJsonFile="RMMSFALatLngJson";

	public static int DistanceRange=3000;
	public static String SalesPersonTodaysTargetMsg="";
	public static final String Preference="RMMPrefrence";
    public static final String AttandancePreference="RMMAttandancePreference";


	public static int CoverageAreaNodeID=0;
	public static int CoverageAreaNodeType=0;
	public static int SalesmanNodeId=0;
	public static int SalesmanNodeType=0;
	public static int flgDataScope=0;
	public static int FlgDSRSO=0;
	public static int DayStartClick=0;
	public static String ImagesFolderServer="RMMSFAImagesServer";



*/













// Its for Training Path on 194 Server




/*

	public static int flgAllRoutesData=1;
	public static File imageF_savedInstance=null;
	public static String imageName_savedInstance=null;
	public static String clickedTagPhoto_savedInstance=null;
	public static Uri uriSavedImage_savedInstance=null;

	public static String imei="";
	public static String SalesQuoteId="BLANK";
	public static String quatationFlag="";
	public static String fileContent="";
	public static String prcID="NULL";

	public static String newQuottionID="NULL";
	public static String globalValueOfPaymentStage="0"+"_"+"0"+"_"+"0";


	public static String WebServicePath="http://103.20.212.194/WebServiceAndroidRSPLTraining/Service.asmx";
	public static String VersionDownloadPath="http://103.20.212.194/downloads/";
	public static String VersionDownloadAPKName="RMMSFATraining.apk";

	public static String DATABASE_NAME = "DbRMMSFAApp";

	public static int AnyVisit = 0;

	public static int DATABASE_VERSIONID = 30;      // put this field value based on value in table on the server
	public static String AppVersionID = "1.7";   // put this field value based on value in table on the server
	public static int Application_TypeID = 2; //1=Parag Store Mapping,2=Parag SFA Indirect,3=Parag SFA Direct

	public static String OrderSyncPath="http://103.20.212.194/ReadXML_RSPLTraining/DefaultSFA.aspx";
	public static String ImageSyncPath="http://103.20.212.194/ReadXML_RSPLImagesTraining/Default.aspx";

	public static String OrderTextSyncPath="http://103.20.212.194/ReadTxtFileForRSPLSFATraining/default.aspx";

	public static String InvoiceSyncPath="http://103.20.212.194/ReadXML_RSPLInvoiceTraining/Default.aspx";

	public static String DistributorSyncPath="http://103.20.212.194/ReadXML_RSPLSFADistributionTraining/Default.aspx";

	// Distributor Map not use in RSPL so we r using this path so that exist code do not show error
	public static String OrderSyncPathDistributorMap="http://103.20.212.194/ReadXML_RSPLTraining/DefaultSODistributorMapping.aspx";


	public static String OrderXMLFolder="RMMSFAXml";
	public static String ImagesFolder="RMMSFAImages";
	public static String TextFileFolder="RMMTextFile";
	public static String InvoiceXMLFolder="RMMInvoiceXml";
	public static String FinalLatLngJsonFile="RMMSFAFinalLatLngJson";

	public static String AppLatLngJsonFile="RMMSFALatLngJson";

	public static int DistanceRange=3000;
	public static String SalesPersonTodaysTargetMsg="";
	public static final String Preference="RMMPrefrence";
	public static final String AttandancePreference="RMMAttandancePreference";
	public static final String DistributorXMLFolder="RMMDistributorXMLFolder";
	public static final String DistributorMapXMLFolder="RMMDistributorMapXML";
	public static final String DistributorStockXMLFolder="RMMDistributorStockXML";
	public static final String DistributorCheckInXMLFolder="RMMDistributorCheckInXML";


	public static int CoverageAreaNodeID=0;
	public static int CoverageAreaNodeType=0;
	public static int SalesmanNodeId=0;
	public static int SalesmanNodeType=0;
	public static int flgDataScope=0;
	public static int FlgDSRSO=0;
	public static int DayStartClick=0;

*/





}
