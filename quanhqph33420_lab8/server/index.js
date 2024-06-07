const express = require("express");
const mongoose = require("mongoose");

try {
  mongoose.connect("mongodb://127.0.0.1:27017/lab8");
  console.log("Connected to lab8");
} catch (error) {
  console.log(error);
}

const app = express();
app.use(express.json());

const schema = new mongoose.Schema({
  name: String,
  img: String,
  time: String,
  type: String,
  description: String,
});

const model = mongoose.model("movies", schema);

app.get("/", async (req, res) => {
  try {
    let result = await model.find({});
    res.send(result);
  } catch (error) {
    console.log(error);
  }
});

app.listen(8000, () => {
  console.log("Server running ....");
});
