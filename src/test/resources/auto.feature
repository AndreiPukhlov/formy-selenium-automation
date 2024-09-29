@forms
  Feature: Forms completion

	@forms1
	Scenario: User fills the autocomplete address form
	  Given user is on the forms page
	  When they go to the autocomplete page
	  And they enter their address into the address autocomplete fields
	  Then the error message is displayed

	@forms2
	Scenario: User can check all check boxes
	  Given user is on the forms page
	  When user goes to checkbox page
	  And check all check boxes one by one
	  And uncheck all check boxes

	@forms3
	Scenario: User can add a date to the date picker
	  Given user is on the forms page
	  When user goes to the date picker page
	  And enter the date to the date field
	  Then the date is saved correctly

	@forms4
	Scenario: User complete web form
	  Given user is on the complete web form page
	  When they enter all required information
	  And they submit the form
	  Then the form submission confirmed