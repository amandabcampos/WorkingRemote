<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Moving Remote</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link rel="stylesheet" href="/style.css" />
</head>
<body>

	<%@ include file="partials/header.jsp"%>

	<div class="container">
		<form method="post" id="createform">
			<fieldset class="form-group">
				<div class="row">
					<legend class="col-form-label col-sm-2 pt-0">
						Population <span>Range: 5 - 8,616,333</span>
					</legend>

					<div class="col-sm-10">
						<div class="form-check">
							<input class="form-check-input" type="number" name="popmin"
								id="min" placeholder="Min">
							<label class="form-check-label" for="min"> Min </label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="number" name="popmax"
								id="max" placeholder="Max">
							<label class="form-check-label" for="max"> Max </label>
						</div>


					</div>
				</div>
			</fieldset>
			<fieldset class="form-group">
				<div class="row">
					<legend class="col-form-label col-sm-2 pt-0">Political
						Preferences</legend>
					<div class="col-sm-10">
						<div class="form-check">
							<input class="form-check-input" type="checkbox" name="political"
								id="dem" value="Democrat"> <label
								class="form-check-label" for="dem"> Democrat </label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="checkbox" name="political"
								id="rep" value="Republican"> <label
								class="form-check-label" for="rep"> Republican </label>
						</div>
					</div>
				</div>
			</fieldset>

			<fieldset class="form-group">
				<div class="row">
					<legend class="col-form-label col-sm-2 pt-0">Population
						Education Level</legend>
					<div class="col-sm-10">
						<div class="form-check">
							<input class="form-check-input" type="checkbox" name="education"
								id="edh" value="High"> <label class="form-check-label"
								for="edh"> High </label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="checkbox" name="education"
								id="edm" value="Medium"> <label class="form-check-label"
								for="edm"> Medium </label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="checkbox" name="education"
								id="edl" value="Low"> <label class="form-check-label"
								for="edl"> Low </label>
						</div>
					</div>
				</div>
			</fieldset>

			<fieldset class="form-group">
				<div class="row">
					<legend class="col-form-label col-sm-2 pt-0">Crime Level</legend>
					<div class="col-sm-10">
						<div class="form-check">
							<input class="form-check-input" type="checkbox" name="crime"
								id="crih" value="high"> <label class="form-check-label"
								for="crih"> High </label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="checkbox" name="crime"
								id="crim" value="medium"> <label
								class="form-check-label" for="crim"> Medium </label>
						</div>
						<div class="form-check disabled">
							<input class="form-check-input" type="checkbox" name="crime"
								id="cril" value="low"> <label class="form-check-label"
								for="cril"> Low </label>
						</div>
					</div>
				</div>
			</fieldset>
			<fieldset class="form-group">
				<div class="row">
					<legend class="col-form-label col-sm-2 pt-0">Timezone</legend>
					<div class="col-sm-10">
						<div class="form-check">
							<input class="form-check-input" type="checkbox" name="timezone"
								id="timeny" value="America/New_York"> <label
								class="form-check-label" for="timeny"> America/New York
							</label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="checkbox" name="timezone"
								id="timechi" value="America/Chicago"> <label
								class="form-check-label" for="timechi"> America/Chicago
							</label>
						</div>
						<div class="form-check disabled">
							<input class="form-check-input" type="checkbox" name="timezone"
								id="timedtw" value="America/Detroit"> <label
								class="form-check-label" for="timedtw"> America/Detroit
							</label>
						</div>
						<div class="form-check disabled">
							<input class="form-check-input" type="checkbox" name="timezone"
								id="timeind" value="America/Indiana/Indianapolis"> <label
								class="form-check-label" for="timeind">
								America/Indiana/Indianapolis </label>
						</div>
						<div class="form-check disabled">
							<input class="form-check-input" type="checkbox" name="timezone"
								id="timeken" value="America/Kentucky/Louisville"> <label
								class="form-check-label" for="timeken">
								America/Kentucky/Louisville </label>
						</div>
						<div class="form-check disabled">
							<input class="form-check-input" type="checkbox" name="timezone"
								id="timeden" value="America/Denver"> <label
								class="form-check-label" for="timeden"> America/Denver </label>
						</div>
						<div class="form-check disabled">
							<input class="form-check-input" type="checkbox" name="timezone"
								id="timeboi" value="America/Boise"> <label
								class="form-check-label" for="timeboi"> America/Boise </label>
						</div>
						<div class="form-check disabled">
							<input class="form-check-input" type="checkbox" name="timezone"
								id="timela" value="America/Los_Angeles"> <label
								class="form-check-label" for="timela"> America/Los
								Angeles </label>
						</div>
						<div class="form-check disabled">
							<input class="form-check-input" type="checkbox" name="timezone"
								id="timepho" value="America/Phoenix"> <label
								class="form-check-label" for="timepho"> America/Phoenix
							</label>
						</div>
						<div class="form-check disabled">
							<input class="form-check-input" type="checkbox" name="timezone"
								id="timehono" value="Pacific/Honolulu"> <label
								class="form-check-label" for="timehono">
								Pacific/Honolulu </label>
						</div>
						<div class="form-check disabled">
							<input class="form-check-input" type="checkbox" name="timezone"
								id="timeanc" value="America/Anchorage"> <label
								class="form-check-label" for="timeanc">
								America/Anchorage </label>
						</div>
					</div>
				</div>
			</fieldset>


		</form>


		<div class="form-group row">
			<div class="col-sm-10">
				<!-- <button type="submit" class="btn btn-secondary" onclick="runTest()">Submit</button> -->
				<button class="btn btn-secondary" onclick="runTest()">Submit</button>
			</div>
		</div>

	</div>
	<%-- <%@ include file="partials/footer.jsp"%> --%>

	<script>
		function runTest() {
			
			let popminvar = document.getElementById("min").value;
			let popmaxvar = document.getElementById("max").value;
			
			
			let checkboxsPol = document.getElementsByName("political");
			let checkboxsEd = document.getElementsByName("education");
			let checkboxsCri = document.getElementsByName("crime");
			let checkboxsTime = document.getElementsByName("timezone");

			let okayPopMin = true;
			let okayPopMax = true;
			let okayPol = false;
			let okayEd = false;
			let okayCri = false;
			let okayTime = false;
			
			if ( (popminvar != "" && popminvar < 5) || (popmaxvar != "" && popmaxvar > 8616333) ){
				okayPopMin = false;
				okayPopMax = false;
				window.alert("Incorrect population range.");
			}
			
			if (popminvar == ""){
				okayPopMin = false;
			}
			
			if (popmaxvar == ""){
				okayPopMax = false;
			}
			
			for (let i = 0, l = checkboxsPol.length; i < l; i++) {
				if (checkboxsPol[i].checked) {
					okayPol = true;
					break;
				}
			}
			
			for (let i = 0, l = checkboxsEd.length; i < l; i++) {
				if (checkboxsEd[i].checked) {
					okayEd = true;
					break;
				}
			}
			
			for (let i = 0, l = checkboxsCri.length; i < l; i++) {
				if (checkboxsCri[i].checked) {
					okayCri = true;
					break;
				}
			}
			
			for (let i = 0, l = checkboxsTime.length; i < l; i++) {
				if (checkboxsTime[i].checked) {
					okayTime = true;
					break;
				}
			}
			
			if (okayPopMin == false || okayPopMax == false || okayPol == false || okayEd == false || okayCri == false || okayTime == false) {
				window.alert("Check at least one box in all categories.");
			} else {
				document.getElementById("createform").submit();
			}

		}
	</script>


</body>
</html>