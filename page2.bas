B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=9.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private txtUser As EditText
	Private txtPassword As EditText
	Private btnLogin As Button
	Private lblForgot As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("login")
	txtUser.Color = Colors.Transparent
	txtPassword.Color = Colors.Transparent

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub btnLogin_Click
	'Activity.Finish
	StartActivity("login3")
End Sub