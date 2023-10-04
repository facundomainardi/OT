Vue.createApp({
    data() {
        return {
            email: "",
            firstName: "",
            lastName: "",
            dni: "",
            cargo:"",
            outPut: "",
            personals: []
        }
    },
    created() {
        this.loadData();
    },
    methods: {
        // load and display JSON sent by server for /clients
        loadData() {
            axios.get("/personals")
                .then((response) => {
                    // handle success
                    this.outPut = response.data;
                    this.personals = response.data._embedded.personals;
                })
                .catch((error) => {
                    alert("Error loading clients: " + error)
                })
        },
        // handler for when user clicks add client
        addClient() {
            if (this.email.length > 1 && this.firstName.length > 1 && this.lastName.length > 1 && this.dni.length > 1 && this.cargo.length > 1) {
                this.postClient(this.email, this.firstName, this.lastName, this.dni, this.cargo);
            }
        },
        // code to post a new client using AJAX
        // on success, reload and display the updated data from the server
        postClient(email, firstName, lastName, dni, cargo) {
            axios.post("/personals", { "email": email, "firstName": firstName, "lastName": lastName, "dni": dni, "cargo": cargo})
                .then((response) => {
                    // handle success
                    this.loadData();
                    this.clearData();
                })
                .catch((error) => {
                    // handle error
                    alert("Error to create client: " + error)
                })
        },
        clearData() {
            this.firstName = "";
            this.lastName = "";
            this.email = "";
            this.dni="";
            this.cargo="";
        }
    }
}).mount("#app");