<template>
    <h1>Modifying Data Window</h1>
  <p>Error Message</p>
  <div class="centering_item">
    <p>
      Name
      <input type="text" name="name">
    </p>
    <p>Description：<br>
      <textarea name="description"></textarea >
    </p>
    <router-link to="/selecteddata">Back</router-link> |
    <input type="button" value="Apply" onclick="history.back()">


  </div>
</template>

<script>
export default {
  name: "ModifyingDataWindow"
}
</script>

<style scoped>
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