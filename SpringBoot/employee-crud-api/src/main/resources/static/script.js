const API_URL = "http://localhost:8080/employees";

// CREATE
function addEmployee() {
    const emp = getFormData();

    fetch(API_URL, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(emp)
    }).then(() => {
        alert("Employee added");
        getEmployees();
    });
}

// READ
function getEmployees() {
    fetch(API_URL)
        .then(res => res.json())
        .then(data => {
            const table = document.getElementById("employeeTable");
            table.innerHTML = "";

            data.forEach(emp => {
                table.innerHTML += `
                    <tr>
                        <td>${emp.id}</td>
                        <td>${emp.name}</td>
                        <td>${emp.department}</td>
                        <td>${emp.salary}</td>
                        <td>
                            <button onclick="deleteEmployee(${emp.id})">Delete</button>
                        </td>
                    </tr>
                `;
            });
        });
}

// UPDATE
function updateEmployee() {
    const emp = getFormData();

    fetch(`${API_URL}/${emp.id}`, {
        method: "PUT",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(emp)
    }).then(() => {
        alert("Employee updated");
        getEmployees();
    });
}

// DELETE
function deleteEmployee(id) {
    fetch(`${API_URL}/${id}`, {
        method: "DELETE"
    }).then(() => {
        alert("Employee deleted");
        getEmployees();
    });
}

// Helper
function getFormData() {
    return {
        id: document.getElementById("id").value,
        name: document.getElementById("name").value,
        department: document.getElementById("department").value,
        salary: document.getElementById("salary").value
    };
}