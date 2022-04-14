# ConferenceTrackManagement

# Get inputs, Topic and Duration to a list of objects. (ListA)
# Sort the list to descending order based on the duration.
# Create another list of objects for the schedule. (MorningSchedule, AfternoonSchedule)
# Loop the ListA, (day=0)
	# if (MaxMorningMins - ListA.item.time) >= 0 // MaxMorningMins 180mins
			MorningSchedule.append(pop(ListA,item), day)
         		MaxMorningMins -= ListA.item.time

	      else if (MaxAfternoonMins - ListA.item.time) > 5   // MaxAfternoonMins 240mins
			AfternoonSchedule.append(pop(ListA.item), day)
			MaxAfternoonMins -= ListA.item.time

	      else
		        day++


# Print by condition of days, (with exception of no date found exit).
