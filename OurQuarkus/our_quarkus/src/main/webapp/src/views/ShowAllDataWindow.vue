<template>
    <h1>Show all data window</h1>

  <div class="centering_parent">
    <div class="centering_item">
  <table border=”1″>
    <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Delete</th>
    </tr>
    <tr>
      <td>1</td>
      <td>Makoto</td>
      <router-link to="/alldata">Delete</router-link>
    </tr>
    <tr>
      <td>2</td>
      <td>Kentaro</td>
      <router-link to="/alldata">Delete</router-link>
    </tr>
  </table>
    </div>
  </div>
  <router-link to="/adddata">Add</router-link>
</template>


<script>
export default {
  name: "ShowAllDataWindow"
}
</script>

<style>
.centering_parent {
  padding: 20px;              /* 余白指定 */
  height: 150px;              /* 高さ指定 */
}

.centering_item {
  width: 200px;               /* 幅指定 */
  height: 90px;               /* 高さ指定 */
  margin:  0 auto;            /* 中央寄せ */
}
</style>