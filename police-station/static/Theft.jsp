<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Theft Complaint</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body class="bg-warning bg-opacity-10 d-flex justify-content-center align-items-center vh-100">

<div class="container" style="max-width: 480px;">
    <form action="theft" method="post" class="p-5 bg-white rounded-5 shadow-lg">
        <h2 class="text-center mb-4 fw-bold text-warning">Theft Complaint Form</h2>

        <div class="mb-3">
            <label for="name" class="form-label fw-semibold">Name</label>
            <input type="text" id="name" name="name" class="form-control" required />
        </div>

        <div class="mb-3">
            <label for="mobile" class="form-label fw-semibold">Mobile</label>
            <input type="tel" id="mobile" name="mobile" class="form-control" required />
        </div>

        <div class="mb-3">
            <label for="age" class="form-label fw-semibold">Age</label>
            <input type="number" id="age" name="age" class="form-control" required />
        </div>

        <div class="mb-3">
            <label for="address" class="form-label fw-semibold">Address</label>
            <input type="text" id="address" name="address" class="form-control" required />
        </div>

        <div class="mb-3">
            <label for="location" class="form-label fw-semibold">Location of Theft</label>
            <input type="text" id="location" name="location" class="form-control" required />
        </div>

        <div class="mb-3">
            <label for="item" class="form-label fw-semibold">Item Lost</label>
            <input type="text" id="item" name="item" class="form-control" required />
        </div>

        <div class="mb-3">
            <label for="lostOn" class="form-label fw-semibold">Date of Theft</label>
            <input type="date" id="lostOn" name="lostOn" class="form-control" required />
        </div>

        <button type="submit" class="btn btn-warning w-100 fw-semibold shadow-sm">Submit Complaint</button>
    </form>
</div>

</body>
</html>
