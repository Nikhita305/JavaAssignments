<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Missing Person Report</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body class="bg-warning bg-opacity-10">

<div class="container d-flex justify-content-center align-items-center vh-100">
    <form action="missing" method="post" class="p-5 bg-white rounded-5 shadow-lg" style="max-width: 480px; width: 100%;">
        <h2 class="text-center mb-4 fw-bold text-warning">Missing Person Report Form</h2>

        <div class="mb-3">
            <label for="missingName" class="form-label fw-semibold text-dark">Missing Person Name</label>
            <input type="text" id="missingName" name="missingName" class="form-control" required />
        </div>

        <div class="mb-3">
            <label for="complainteeMobile" class="form-label fw-semibold text-dark">Complaintee Mobile</label>
            <input type="tel" id="complainteeMobile" name="complainteeMobile" class="form-control" required />
        </div>

        <div class="mb-3">
            <label for="age" class="form-label fw-semibold text-dark">Age</label>
            <input type="number" id="age" name="age" class="form-control" required />
        </div>

        <div class="mb-3">
            <label for="address" class="form-label fw-semibold text-dark">Address</label>
            <input type="text" id="address" name="address" class="form-control" required />
        </div>

        <div class="mb-3">
            <label for="location" class="form-label fw-semibold text-dark">Last Seen Location</label>
            <input type="text" id="location" name="location" class="form-control" required />
        </div>

        <div class="mb-3">
            <label for="marks" class="form-label fw-semibold text-dark">Identifiable Marks</label>
            <input type="text" id="marks" name="marks" class="form-control" />
        </div>

        <div class="mb-3">
            <label for="gender" class="form-label fw-semibold text-dark">Gender</label>
            <input type="text" id="gender" name="gender" class="form-control" required />
        </div>

        <div class="mb-3">
            <label for="lang" class="form-label fw-semibold text-dark">Known Languages</label>
            <input type="text" id="lang" name="lang" class="form-control" />
        </div>

        <button type="submit" class="btn btn-warning w-100 fw-semibold shadow-sm text-dark">Report Missing Person</button>
    </form>
</div>

</body>
</html>
